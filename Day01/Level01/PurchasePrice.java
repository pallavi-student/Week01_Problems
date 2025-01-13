import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int amount = input.nextInt();

        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR "+ totalPrice+ " if the quantity is " + amount + " and unit price is INR " + unitPrice);
    }
}
