import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // creating scanner object
        Scanner scanner = new Scanner(System.in);
        // Taking number input from scanner object
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
            // Checking for divisibility of no for factor 
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
