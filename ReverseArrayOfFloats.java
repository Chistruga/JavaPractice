import java.util.Scanner;

public class ReverseArrayOfFloats {
    private static int numberOfElementsInArray;

    public static void reverseAnArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of elements in the array: ");
        numberOfElementsInArray = scanner.nextInt();

        System.out.println("Enter the elements for your array:");
        double[] initialArray = new double[numberOfElementsInArray];
        for(int i=0; i<numberOfElementsInArray; i++){
            initialArray[i] = scanner.nextDouble();
        }
        System.out.println("Your initial array is: ");
        for(double k:initialArray){
            System.out.print(k + ",\t");
        }

        System.out.println("\nReversed array is: ");
        for (int i=numberOfElementsInArray-1; i>=0; i--){
            System.out.print(initialArray[i] + ",\t");
        }
    }
}
