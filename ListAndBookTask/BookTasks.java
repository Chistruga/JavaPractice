package ListAndBookTask;

import Utils.BookLanguages;

import java.util.*;
import java.util.stream.Collectors;

public class BookTasks {

    public Comparator<Map<String, String>> mapComparator = (m1, m2) -> m1.get("author").compareTo(m2.get("author"));

    public void BookExample() {
        ListOfBooks list = new ListOfBooks();

        Map<String, String> spanishBook = list.getBooks().stream()
                .filter(map -> map.get("language").equals(BookLanguages.SPANISH.name()))
                .findFirst().orElseThrow(NoSuchElementException::new);

        System.out.println("First Spanish Book from the list: \n" + spanishBook);

        Collections.sort(list.getBooks(), mapComparator);

        System.out.println("List of books sorted in ascending order: \n" + list.getBooks());

        Optional<Map<String, String>> maxPageValue = list.getBooks().stream()
                .max(Comparator.comparing((Map<String, String> m) -> m.get("numberOfPages")));

        System.out.println("Book with the maximum page value is: " + maxPageValue.get().get("title"));

        List<Map<String, String>> returnBooksWithMoreThan200Pages = list.getBooks().stream()
                .filter(a -> Integer.parseInt(a.get("numberOfPages")) > 200)
                .collect(Collectors.toList());

        System.out.println("List of books which have more than 200 pages: \n" + returnBooksWithMoreThan200Pages);
    }
}