import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = Math.abs(scanner.nextLong());

        // Count digits and store them in an array
        int digitCount = String.valueOf(number).length();
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int) (number % 10);
            number /= 10;
        }

        // Frequency array
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Display frequencies
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        scanner.close();
    }
}

