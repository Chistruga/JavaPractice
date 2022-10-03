import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
    private static int numberOfElementsInArray;
    private static int numberOfEvenElements = 0;
    private static int sumOfOddElements = 0;

    public static void findSumOfOddElementsAndTotalNumberOfEvenElements(){
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
            if(initialArray[i]%2 == 0){
                numberOfEvenElements++;
            }
            else{
                sumOfOddElements+=initialArray[i];
            }
        }

        System.out.println("\nThe Total Even numbers is: " + numberOfEvenElements);
        System.out.println("\nThe Total Sum of Odd numbers is: " + sumOfOddElements);
        }


    }
