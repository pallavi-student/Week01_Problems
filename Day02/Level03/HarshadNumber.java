import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10; // Add last digit
            originalNumber /= 10;      // Remove last digit
        }

        // Check if number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
}

