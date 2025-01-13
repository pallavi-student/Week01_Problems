import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store multiplication results
        int[] multiplicationTable = new int[10];

        // the array with results
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Displaying results
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
    }
}
