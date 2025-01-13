import java.util.Scanner;

// Class to check which number is the largest
public class LargestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();

        // Check which number is the largest
        boolean isFirstNumberLargest = firstNumber > secondNumber && firstNumber > thirdNumber;
        boolean isSecondNumberLargest = secondNumber > firstNumber && secondNumber > thirdNumber;
        boolean isThirdNumberLargest = thirdNumber > firstNumber && thirdNumber > secondNumber;

        // Print the results
        System.out.println("Is the first number the largest? " + (isFirstNumberLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondNumberLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdNumberLargest ? "Yes" : "No"));
    }
}