import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        // Calculate the sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i;
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
    }
}

