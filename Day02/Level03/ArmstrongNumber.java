import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize variables
        int originalNumber = number;
        int sum = 0;

        // Check Armstrong number using while loop
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Get last digit
            sum += Math.pow(remainder, 3);      // Add cube of the digit to sum
            originalNumber /= 10;              // Remove last digit
        }

        // Compare sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}