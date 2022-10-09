import JavaExercisesTask.*;
import OOPTask.Circle;
import OOPTask.Rectangle;
import OOPTask.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        BubbleSort bubbleSort = new BubbleSort();
        MagicalSquare magicalSquare = new MagicalSquare();
        ReverseArrayOfFloats reverseArrayOfFloats = new ReverseArrayOfFloats();
        SumOfOddAndEvenNumbers sumOfOddAndEvenNumbers = new SumOfOddAndEvenNumbers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Check if a string of characters is a Palindrome\n" +
                "2. Inverse the elements of an array\n" +
                "3. Sort array elements using Bubble Sort\n" +
                "4. Determine sum of odd numbers and the amount of even numbers\n" +
                "5. Check if two-dimensional matrix is Magic\n" +
                "6. OOP Task\n" +
                "7. Exit");

        boolean quit = false;
        do {
            System.out.println("\nChoose one of the above displayed options by number: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    checkPalindrome.checkIfAStringIsPalindrome();
                    break;
                case 2:
                    reverseArrayOfFloats.reverseAnArray();
                    break;
                case 3:
                    bubbleSort.sortElementsInArrayBubbleSort();
                    break;
                case 4:
                    sumOfOddAndEvenNumbers.findSumOfOddElementsAndTotalNumberOfEvenElements();
                    break;
                case 5:
                    magicalSquare.readMatrixFromConsoleAndSeeIfItIsMagic();
                    break;
                case 6:
                    Circle circle = new Circle();
                    circle.displayFigureName();
                    circle.calculateFigureArea();
                    circle.calculateFigurePerimeter();

                    System.out.println("\n");

                    Square square = new Square(6);
                    square.showFigureName();
                    square.displaySideNumbers();
                    square.calculateFigureArea();
                    square.calculateFigurePerimeter();

                    System.out.println("\n");

                    Rectangle rectangle = new Rectangle(4, 5);
                    rectangle.showFigureName();
                    rectangle.displaySideNumbers();
                    rectangle.calculateFigureArea();
                    rectangle.calculateFigurePerimeter();
                    break;
                case 7:
                    System.out.println("\nEXIT");
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter a number from 1 to 6");
            }
        }
        while (!quit);
    }
}
