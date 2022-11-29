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

        System.out.println("\n\nHashSet size is: " + exampleSet.size());

        System.out.print("HashSet elements are:");
        Iterator<Integer> iterator = exampleSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }

        exampleSet.remove(0);

        for (Integer element : exampleSet) {
            if (element % 2 == 0) {
                multipliedEvenSetElements *= element;
            }
        }
        System.out.println("\nTotal Multiplied Even elements is: " + multipliedEvenSetElements);
    }
}