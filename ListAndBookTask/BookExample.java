package ListAndBookTask;

import Utils.Book;

import java.util.*;
import java.util.stream.Collectors;

public class BookExample {
    public Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> m1, Map<String, String> m2) {
            return m1.get("author").compareTo(m2.get("author"));
        }
    };


    public void BookExample() {
        Book book1 = new Book("The lucky mill", "Ioan Slavici", "320", "Lumina", "Romanian", "Novella");
        Book book2 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", "306", "Curtea Veche Publishing", "English", "Self-help book");
        Book book3 = new Book("The Alchemist", "Paulo Coelho", "400", "Curtea Veche Publishing", "Spanish", "Novel");
        Book book4 = new Book("The Shadow of the Wind", "Carlos Ruiz Zafón", "500", "Curtea Veche Publishing", "English", "Novel");
        Book book5 = new Book("La casa de los espíritus", "Isabel Allende", "120", "Curtea Veche Publishing", "Spanish", "Novel");
        Book book6 = new Book("Twenty Love Poems and a Song of Despair", "Pablo Neruda", "250", "Curtea Veche Publishing", "English", "Romantic poems");
        Book book7 = new Book("The Power of Now: A Guide to Spiritual Enlightenment", "Eckhart Tolle", "520", "Curtea Veche Publishing", "English", "Self-help book");
        Book book8 = new Book("The 48 Laws of Power", "Robert Greene", "400", "Curtea Veche Publishing", "English", "Self-help book");

        HashMap<String, String> bookMap1 = new HashMap<>();
        bookMap1.put("title", book1.getTitle());
        bookMap1.put("author", book1.getAuthor());
        bookMap1.put("numberOfPages", book1.getNumberOfPages());
        bookMap1.put("publisher", book1.getPublisher());
        bookMap1.put("language", book1.getLanguage());
        bookMap1.put("bookType", book1.getBookType());

        HashMap<String, String> bookMap2 = new HashMap<>();
        bookMap2.put("title", book2.getTitle());
        bookMap2.put("author", book2.getAuthor());
        bookMap2.put("numberOfPages", book2.getNumberOfPages());
        bookMap2.put("publisher", book2.getPublisher());
        bookMap2.put("language", book2.getLanguage());
        bookMap2.put("bookType", book2.getBookType());

        HashMap<String, String> bookMap3 = new HashMap<>();
        bookMap3.put("title", book3.getTitle());
        bookMap3.put("author", book3.getAuthor());
        bookMap3.put("numberOfPages", book3.getNumberOfPages());
        bookMap3.put("publisher", book3.getPublisher());
        bookMap3.put("language", book3.getLanguage());
        bookMap3.put("bookType", book3.getBookType());

        HashMap<String, String> bookMap4 = new HashMap<>();
        bookMap4.put("title", book4.getTitle());
        bookMap4.put("author", book4.getAuthor());
        bookMap4.put("numberOfPages", book4.getNumberOfPages());
        bookMap4.put("publisher", book4.getPublisher());
        bookMap4.put("language", book4.getLanguage());
        bookMap4.put("bookType", book4.getBookType());

        HashMap<String, String> bookMap5 = new HashMap<>();
        bookMap5.put("title", book5.getTitle());
        bookMap5.put("author", book5.getAuthor());
        bookMap5.put("numberOfPages", book5.getNumberOfPages());
        bookMap5.put("publisher", book5.getPublisher());
        bookMap5.put("language", book5.getLanguage());
        bookMap5.put("bookType", book5.getBookType());

        HashMap<String, String> bookMap6 = new HashMap<>();
        bookMap6.put("title", book6.getTitle());
        bookMap6.put("author", book6.getAuthor());
        bookMap6.put("numberOfPages", book6.getNumberOfPages());
        bookMap6.put("publisher", book6.getPublisher());
        bookMap6.put("language", book6.getLanguage());
        bookMap6.put("bookType", book6.getBookType());

        HashMap<String, String> bookMap7 = new HashMap<>();
        bookMap7.put("title", book7.getTitle());
        bookMap7.put("author", book7.getAuthor());
        bookMap7.put("numberOfPages", book7.getNumberOfPages());
        bookMap7.put("publisher", book7.getPublisher());
        bookMap7.put("language", book7.getLanguage());
        bookMap7.put("bookType", book7.getBookType());

        HashMap<String, String> bookMap8 = new HashMap<>();
        bookMap8.put("title", book8.getTitle());
        bookMap8.put("author", book8.getAuthor());
        bookMap8.put("numberOfPages", book8.getNumberOfPages());
        bookMap8.put("publisher", book8.getPublisher());
        bookMap8.put("language", book8.getLanguage());
        bookMap8.put("bookType", book8.getBookType());

        List<Map<String, String>> exampleList = new ArrayList<>();
        exampleList.add(bookMap1);
        exampleList.add(bookMap2);
        exampleList.add(bookMap3);
        exampleList.add(bookMap4);
        exampleList.add(bookMap5);
        exampleList.add(bookMap6);
        exampleList.add(bookMap7);
        exampleList.add(bookMap8);

        Map<String, String> spanishBook = exampleList.stream()
                .filter(map -> map.get("language").equals("Spanish"))
                .findFirst().orElseThrow(NoSuchElementException::new);

        System.out.println("First Spanish Book from the list: \n" + spanishBook);

        Collections.sort(exampleList, mapComparator);

        System.out.println("List of books sorted in ascending order: \n" + exampleList);

        Optional<Map<String, String>> maxPageValue = exampleList.stream()
                .max(Comparator.comparing((Map<String, String> m) -> m.get("numberOfPages")));

        System.out.println("Book with the maximum page value is: " + maxPageValue.get().get("title"));

        List<Map<String, String>> returnBooksWithMoreThan200Pages = exampleList.stream()
                .filter(a -> Integer.parseInt(a.get("numberOfPages")) > 200)
                .collect(Collectors.toList());

        System.out.println("List of books which have more than 200 pages: \n" + returnBooksWithMoreThan200Pages);
    }
}
