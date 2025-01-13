import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double heightInches = heightCm / 2.54; // Convert cm to inches
        int heightFeet = (int) (heightInches / 12); // Convert inches to feet
        heightInches %= 12; //Remaining inches after converting to feet

        System.out.println("Your height in cm is "+ heightCm+ " while in feet is " + heightFeet + " and inches is " + heightInches);
    }
}
