import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3; // Convert feet to yards
        double miles = yards / 1760;// Convert yards to miles

        System.out.println("The distance is "+ yards+ " yards and "+ miles + " miles.");
    }
}
