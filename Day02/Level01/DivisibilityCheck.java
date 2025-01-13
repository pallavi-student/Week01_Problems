import java.util.Scanner;

// Class to check divisibility by 5
public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the user input
        System.out.print("Enter a number: ");
        int userInputNumber = input.nextInt();

        // Check divisibility by 5
        boolean isDivisibleByFive = userInputNumber % 5 == 0;

        // Print the result
        System.out.println("Is the number " + userInputNumber + " divisible by 5? " + (isDivisibleByFive ? "Yes" : "No"));
    }
}
