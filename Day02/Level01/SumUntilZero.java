import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize variables
        double totalSum = 0.0;

        // Infinite loop to take user input until 0 is entered
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double userNumber = input.nextDouble();

            // Exit the loop if user enters 0
            if (userNumber == 0) {
                break;
            }

            // Add the number to the total sum
            totalSum += userNumber;
        }

        // Print the total sum
        System.out.println("The total sum is: " + totalSum);
    }
}