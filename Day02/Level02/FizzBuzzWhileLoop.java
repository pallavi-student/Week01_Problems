import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is valid
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            // Initialize the counter
            int i = 1;

            // Loop until the counter exceeds the given number
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                // Increment the counter
                i++;
            }
        }
    }
}