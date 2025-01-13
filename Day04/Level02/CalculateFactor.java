import java.util.Scanner;
public class CalculateFactor {

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }
    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i=0;i<factors.length;i++) {
            sum +=factors[i];
        }
        return sum;
    }
    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int i=0;i<factors.length;i++) {
            product +=factors[i];
        }
        return product;
    }
    // Method to find the sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int i=0;i<factors.length;i++) {
            
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        } // Find the factors
        int[] factors = findFactors(number);

        // Calculate sum, product, and sum of squares of factors
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumOfSquares = sumOfSquaresOfFactors(factors);

        // Display the factors and results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        scanner.close();
    }
}
