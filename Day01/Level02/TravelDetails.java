import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n >= 0) {
            // Calculate factorial using while loop
            int factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Print the factorial
            System.out.println("The factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}