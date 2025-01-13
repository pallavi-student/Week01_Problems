import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        // Input height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert height from centimeters to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determine BMI category
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display results
        System.out.println("\n--- BMI Result ---");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("BMI: " + String.format("%.2f", bmi));
        System.out.println("Status: " + status);
    }
}