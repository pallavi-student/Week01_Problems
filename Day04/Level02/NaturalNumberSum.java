import java.util.Scanner;

public class NaturalNumberSum {
    // Method to calculate the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    // Method to calculate the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get user input for n
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Input must be greater than 0. ");
            return;
        }
        // sum using recursion and formula
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);
        // Display the results
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        // Compare the results
        if (sumRecursion == sumFormula) {
            System.out.println("Both methodsgive same result.");
        } else {
            System.out.println("The results do not match.");
        }

        input.close();
    }
}
