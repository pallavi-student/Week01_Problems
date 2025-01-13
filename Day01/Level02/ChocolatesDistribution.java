import java.util.Scanner;

public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the total number of children: ");
        int numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // Chocolates each child gets
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Remaining chocolates

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates is " + remainingChocolates);
    }
}
