import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a Prime Number.");
        } else {
            // Initialize the isPrime flag
            boolean isPrime = true;

            // Check divisors from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Not a prime number
                    break; // Exit the loop
                }
            }

            // Print the result based on isPrime flag
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        }
    }
}