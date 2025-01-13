import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}