import java.util.Scanner;

public class BubbleSort {
    private static int numberOfElementsInArray;
    private static int temporaryElement = 0;

    public static void sortElementsInArrayBubbleSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number of elements in the array: ");
        numberOfElementsInArray = scanner.nextInt();

        System.out.println("Enter the elements for your array:");
        int[] initialArray = new int[numberOfElementsInArray];
        for(int i=0; i<numberOfElementsInArray; i++){
            initialArray[i] = scanner.nextInt();
        }
        System.out.println("Your initial array is: ");
        for(int k:initialArray){
            System.out.print(k + ",\t");
        }
        for(int i=0; i<numberOfElementsInArray; i++){
            for (int j=1; j <(numberOfElementsInArray-i); j++){
                if(initialArray[j-1] > initialArray[j]){
                    temporaryElement = initialArray[j-1];
                    initialArray[j-1] = initialArray[j];
                    initialArray[j] = temporaryElement;
                }
            }
        }

        System.out.println("\nArray after Bubble sort: ");
        for(int k:initialArray){
            System.out.print(k + ",\t");
        }
}
}
