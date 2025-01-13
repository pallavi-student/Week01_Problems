import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the greatest factor
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}