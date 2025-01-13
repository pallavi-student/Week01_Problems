import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = input.nextDouble();

        double areaCm = 0.5* base* height; // Area in cm^2
        double areaInches = areaCm / 6.4516; // Convert to square inches

        System.out.println("The area of the triangle is "+ areaCm + " cm² and " + areaInches + " square inches.");
    }
}
