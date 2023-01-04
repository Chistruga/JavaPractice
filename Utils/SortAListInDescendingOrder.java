package Utils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAListInDescendingOrder<T extends Comparable<T>> {
    public void sortInDescendingOrder(List<T> listToSortInDescendingOrder) {
        try {
            List sortedListInDescendingOrder = listToSortInDescendingOrder.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
            System.out.println("Before Sorting: " + listToSortInDescendingOrder);
            System.out.println("After Sorting: " + sortedListInDescendingOrder);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}