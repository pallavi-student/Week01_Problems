import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // digits adding into an array
        int digitCount = (int) Math.log10(number) + 1;
        int[] digits = new int[digitCount];

        int index = 0;
        while (number != 0) {
            digits[index++] = (int) (number % 10);
            number /= 10;
        }

        // Showing reversed number
        System.out.print("Reversed Number ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
    }
}
