package JavaTaskSynamicSizeArray;

import Utils.ReadDynamicSizeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicSizeArrayQueries {

    private int numberOfQueries;
    private int axisX;
    private int axisY;

    public void getElementsOfDynamicArrayUsingQueries() {
        ReadDynamicSizeArray readDynamicSizeArray = new ReadDynamicSizeArray();
        Scanner scanner = new Scanner(System.in);
        ArrayList[] arrayLists = readDynamicSizeArray.readDynamicArray();
        System.out.println("Give the number of queries: ");
        numberOfQueries = scanner.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            System.out.println("Enter the combinations on X & Y Axis to find the element: ");
            System.out.println("X: ");
            axisX = scanner.nextInt();
            System.out.println("Y: ");
            axisY = scanner.nextInt();

            try {
                System.out.println(arrayLists[axisX - 1].get(axisY - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
