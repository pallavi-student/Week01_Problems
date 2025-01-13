import java.util.Scanner;

// Class to calculate the sum of natural numbers
public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number to check if it's a natural number
        System.out.print("Enter a number: ");
        int userInputNumber = input.nextInt();

        // Check if the number is a natural number
        boolean isNaturalNumber = userInputNumber > 0;

        if (isNaturalNumber) {
            // Calculate the sum using the formula
            int sumUsingFormula = userInputNumber * (userInputNumber + 1) / 2;

            // Calculate the sum using a loop
            int sumUsingLoop = 0;
            for (int i = 1; i <= userInputNumber; i++) {
                sumUsingLoop += i;
            }

            // Print the results
            System.out.println("The sum of " + userInputNumber + " natural numbers is " + sumUsingFormula);
            System.out.println("The sum calculated using the loop is " + sumUsingLoop);
        } else {
            System.out.println("The number " + userInputNumber + " is not a natural number.");
        }
    }
}