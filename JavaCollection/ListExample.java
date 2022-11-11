package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public void iterateAndJoinAllElementsOfAString() {
        List<String> exampleList = new ArrayList<>();
        exampleList.add("One");
        exampleList.add("Two");
        exampleList.add("Three");
        exampleList.add("Four");
        exampleList.add("Five");
        exampleList.add("Six");
        exampleList.add("PleasePrintMe");
        exampleList.add("DoNotPrint");

        System.out.println("List Elements are: ");
        Iterator<String> iterator = exampleList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Joined List Elements are: ");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
        }

    }
}
