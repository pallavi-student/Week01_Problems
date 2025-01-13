import java.util.Scanner;

// Class to determine if the first number is the smallest
public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take inputs for the three numbers
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();

        // Check if the first number is the smallest
        boolean isFirstNumberSmallest = (firstNumber < secondNumber && firstNumber < thirdNumber);

        // Print the result
        System.out.println("Is the first number the smallest? " + (isFirstNumberSmallest ? "Yes" : "No"));
    }
}
