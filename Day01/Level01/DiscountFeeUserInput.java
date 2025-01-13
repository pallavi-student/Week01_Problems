import java.util.Scanner;

public class DiscountFeeUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fee amount (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = fee * discountPercent / 100.0; // Calculate discount
        double discountedFee = fee - discount; //Calculate final fee after discount

        System.out.println("The discount amount is INR "+ discount+ " and final discounted fee is INR " + discountedFee);
    }
}