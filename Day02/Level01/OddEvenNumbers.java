import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n > 0) {
            // Loop from 1 to n to print odd and even numbers
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        } else {
            System.out.println("Please enter a natural number.");
        }
    }
}
