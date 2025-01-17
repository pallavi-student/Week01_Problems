import java.util.Scanner;

public class DemoArrayIndexOutOfBoundsException {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array) {
        // Trying to access an index that is out of bounds
        System.out.println(array[array.length]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] array) {
        try {
            // Attempting to access an out-of-bounds index
            System.out.println(array[array.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching and handling the exception
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking array input from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] array = new String[n];
        System.out.println("Enter " + n + " elements for the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        // Demonstrating ArrayIndexOutOfBoundsException without handling
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException:");
        try {
            generateArrayIndexOutOfBoundsException(array);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Handling ArrayIndexOutOfBoundsException with try-catch
        System.out.println("\nHandling ArrayIndexOutOfBoundsException gracefully:");
        handleArrayIndexOutOfBoundsException(array);

        scanner.close(); // Closing the scanner
    }
}
