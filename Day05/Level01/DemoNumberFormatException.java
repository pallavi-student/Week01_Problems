import java.util.Scanner;

public class DemoNumberFormatException {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        System.out.println(Integer.parseInt(text)); // This will throw NumberFormatException
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            System.out.println(Integer.parseInt(text)); // Attempt to parse the text
        } catch (NumberFormatException e) {
            // Catch and handle NumberFormatException
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to convert to an integer: ");
        String userInput = scanner.nextLine();

        // Demonstrate NumberFormatException without handling
        System.out.println("\nDemonstrating NumberFormatException:");
        try {
            generateNumberFormatException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Handle NumberFormatException using try-catch
        System.out.println("\nHandling NumberFormatException gracefully:");
        handleNumberFormatException(userInput);

        scanner.close(); // Close the scanner
    }
}
