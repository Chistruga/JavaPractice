package Utils;

import java.util.Scanner;

public class ReadAnArrayFromConsole {
    private int numberOfElementsInArray;

    public int getNumberOfElementsInArray() {
        return numberOfElementsInArray;
    }

    public int[] readIntArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of elements in the array: ");
        numberOfElementsInArray = scanner.nextInt();

        System.out.println("Enter the elements for your array:");
        int[] initialArray = new int[numberOfElementsInArray];
        for (int i = 0; i < numberOfElementsInArray; i++) {
            initialArray[i] = scanner.nextInt();
        }
        System.out.println("Your initial array is: ");
        for (int k : initialArray) {
            System.out.print(k + "\t");
        }
        return initialArray;
    }

    public double[] readDoubleArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of elements in the array: ");
        numberOfElementsInArray = scanner.nextInt();

        System.out.println("Enter the elements for your array:");
        double[] initialArray = new double[numberOfElementsInArray];
        for (int i = 0; i < numberOfElementsInArray; i++) {
            initialArray[i] = scanner.nextInt();
        }
        System.out.println("Your initial array is: ");
        for (double k : initialArray) {
            System.out.print(k + "\t");
        }
        return initialArray;
    }

}
