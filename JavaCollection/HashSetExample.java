package JavaCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public void createHashSet() {
        long multipliedEvenSetElements = 1;

        HashSet<Integer> exampleSet = new HashSet<>();
        for (int i = 0; i <= 10; i++) {
            exampleSet.add(i);
        }

        System.out.println("HashSet size is: " + exampleSet.size());

        System.out.print("HashSet elements are:");
        Iterator<Integer> iterator = exampleSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }

        HashSet<Integer> anotherExampleSet = new HashSet<>();
        anotherExampleSet.addAll(exampleSet);
        anotherExampleSet.remove(0);
        for (Integer element : anotherExampleSet) {
            if (element % 2 == 0) {
                multipliedEvenSetElements *= element;
            }
        }
        System.out.println("\nTotal Multiplied Even elements is: " + multipliedEvenSetElements);
    }
}