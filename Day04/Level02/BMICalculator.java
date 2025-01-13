import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI 
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; 
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3]; // 2D array 

        //weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }

        // Calculating BMI and populate the array
        calculateBMI(data);

        // Determine BMI status
        String[] status = determineBMIStatus(data);

        // Display
        System.out.println("\nPerson\tWeight kg\tHeight cm\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t" + status[i]);
        }
    }
}