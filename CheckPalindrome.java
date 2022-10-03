import java.util.Scanner;

public class CheckPalindrome {
    private static String givenString;
    private static String reversedString = "";

    public static void checkIfAStringIsPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a Palindrome or not: ");
        givenString = sc.nextLine();

        for(int i = (givenString.length()-1); i>=0; --i){
            reversedString += givenString.charAt(i);
        }

        if (reversedString.equals(givenString))
        {
            System.out.println("Entered string is a Palindrome");
        }
        else
        {
            System.out.println("Given String is not a Palindrome");
        }

    }

}
