
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;

        // Count digits using while loop
        while (number != 0) {
            number /= 10; // Remove last digit
            count++;
        }

        System.out.println("The number of digits is: " + count);
    }
}

