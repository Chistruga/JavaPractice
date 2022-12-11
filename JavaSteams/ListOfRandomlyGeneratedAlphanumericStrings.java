package JavaSteams;

import Utils.GenerateRandomAlphanumericString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ListOfRandomlyGeneratedAlphanumericStrings {


    public static void main(String[] args) {
        String stringOfList = "";
//
//    }
//    public void getList() {
        GenerateRandomAlphanumericString randomAlphanumericString = new GenerateRandomAlphanumericString();
        List<String> list = new ArrayList<>();
        list.add("lesa");
        list.add("alesa");
        list.add("aaales");
        for (int i = 0; i < 20; i++) {
            stringOfList = randomAlphanumericString.generateRandomAlphanumericString(10);
            list.add(stringOfList);
        }
        sortInDescendingOrder(list);
        removeElementFromTheList(list);


//        for (String listElements : list) {
//            System.out.print(" " + listElements);
//        }
    }

    public static void sortInDescendingOrder(List<String> listToSortInDescendingOrder) {
        List<String> sortedListInDescendingOrder = listToSortInDescendingOrder.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Before Sorting: " + listToSortInDescendingOrder);
        System.out.println("After Sorting: " + sortedListInDescendingOrder);
    }

    public static void removeElementFromTheList(List<String> initialList) {
        List<String> anotherList = initialList;
        anotherList.removeIf(n -> (n.contains("les")));
        System.out.println("After removing: " + anotherList);
        System.out.println("Before removing: " + initialList);
    }

}
