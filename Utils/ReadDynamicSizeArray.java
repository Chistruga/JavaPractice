package Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadDynamicSizeArray {
    private int numberOfLinesInArray;

    private int numberOfElementsPerLine;

    private int element;

    public ArrayList[] readDynamicArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList[] arrayList = new ArrayList[20000];
        System.out.println("Give the number of lines in array: ");
        numberOfLinesInArray = scanner.nextInt();
        for (int i = 0; i < numberOfLinesInArray; i++) {
            arrayList[i] = new ArrayList();
            System.out.println("Give the number of elements for the line: ");
            numberOfElementsPerLine = scanner.nextInt();
            System.out.println("Give the line elements: ");
            for (int j = 0; j < numberOfElementsPerLine; j++) {
                element = scanner.nextInt();
                arrayList[i].add(element);
            }
        }
        return arrayList;
    }
}