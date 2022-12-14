package JavaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookExample {
    public static void main(String[] args) {
//        Book book1 = new Book("The lucky mill", "Ioan Slavici", 320, "Lumina", "Romanian", "Novella");
//        Book book2 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", "Spanish", "Self-help book");
//        Book book3 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", "Spanish", "Self-help book");
//        Book book4 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", "English", "Self-help book");
//        Book book5 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", "English", "Self-help book");
//        Book book6 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", "English", "Self-help book");
//        Book book7 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", "English", "Self-help book");
//        Book book8 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", "English", "Self-help book");
//
//        HashMap<String, Object> bookMap1 = new HashMap<>();
//        bookMap1.put("title", book1.getTitle());
//        bookMap1.put("author", book1.getAuthor());
//        bookMap1.put("numberOfPages", book1.getNumberOfPages());
//        bookMap1.put("publisher", book1.getPublisher());
//        bookMap1.put("language", book1.getLanguage());
//        bookMap1.put("bookType", book1.getBookType());
//
//        HashMap<String, Object> bookMap2 = new HashMap<>();
//        bookMap2.put("title", book2.getTitle());
//        bookMap2.put("author", book2.getAuthor());
//        bookMap2.put("numberOfPages", book2.getNumberOfPages());
//        bookMap2.put("publisher", book2.getPublisher());
//        bookMap2.put("language", book2.getLanguage());
//        bookMap2.put("bookType", book2.getBookType());

        Map<String, Object> bookMap1 = new HashMap<>();
        bookMap1.put("title", "U");
        bookMap1.put("author", "UU");
        bookMap1.put("numberOfPages", 36);
        bookMap1.put("publisher", "ii");
        bookMap1.put("language", "romanian");
        bookMap1.put("bookType", "bb");

        Map<String, Object> bookMap2 = new HashMap<>();
        bookMap2.put("title", "A");
        bookMap2.put("author", "Aa");
        bookMap2.put("numberOfPages", 63);
        bookMap2.put("publisher", "XA");
        bookMap2.put("language", "Spanish");
        bookMap2.put("bookType", "ll");

        List<Map<String, Object>> exampleList = new ArrayList<>();
        exampleList.add(bookMap1);
        exampleList.add(bookMap2);

        List<Map<String, Object>> spanishBook = exampleList.stream()
                .filter(map->map.containsValue("Spanish"))
                .collect(Collectors.toList());

//        for (List<Map<String, Object>> spanishBook1 : exampleList) {
//            System.out.print(" " + listElements);
//        }


    }
}
