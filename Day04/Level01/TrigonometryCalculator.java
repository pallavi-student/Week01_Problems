import java.util.Scanner;
public class TrigonometryCalculator {
   // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        double[]result=new double[]{sine, cosine, tangent};
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input for angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] results = calculateTrigonometricFunctions(angle);
        // Print the results
        System.out.println("Trigonometric functions for angle " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
