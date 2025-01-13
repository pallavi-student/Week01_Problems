import java.util.Scanner;

public class DiscountedFee {
    public static void main(String[] args) {
        int fee = 125000; // Course fee
        int discountPercent = 10;// Discount percentage

        double discount = fee * discountPercent / 100.0; // Calculate discount
        double discountedFee = fee - discount;// Calculate final fee after discount

        System.out.println("The discount amount is INR " + discount+ " and final discounted fee is INR "+ discountedFee);
    }
}
