import java.util.Scanner;

public class SumOfNaturalNumbersUsingFor {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            // Calculate sum using formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Calculate sum using while loop
            int sumUsingLoop = 0;
            for(int i=1;i<=n;i++) {
                sumUsingLoop += i;
            }

            // Print the results
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingLoop);
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
