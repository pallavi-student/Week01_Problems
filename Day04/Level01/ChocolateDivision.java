import java.util.Scanner;

public class ChocolateDivision {

    // Method to find the number of chocolates each child gets and the remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Chocolates each child gets
        int remainder = number % divisor; // Remaining chocolates
        int[]arr= new int[]{quotient, remainder};
    return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Get input for number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        if (numberOfChildren <= 0) {
            System.out.println("The number of children must be greater than 0.");
            return;
        }
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        int chocolatesEachChildGets = result[0];
        int remainingChocolates = result[1];

        // Print the results
        System.out.println("Each child gets: " + chocolatesEachChildGets + " chocolates.");
        System.out.println("Remaining chocolates: " + remainingChocolates);
    }
}