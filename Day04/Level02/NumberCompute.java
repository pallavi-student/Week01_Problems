import java.util.Scanner;

public class NumberCompute {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        return Integer.compare(number1, number2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i=0;i<numbers.length;i++) {
            if (isPositive(number)) {
                System.out.print("Number " + number + " is Positive and ");
                System.out.println(isEven(number) ? "Even." : "Odd.");
            } else {
                System.out.println("Number " + number + " is Negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        System.out.println("Comparison of the first and last elements:");
        if (comparison > 0) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparison == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }
}
