package Day05.Level03;
import java.util.Scanner;

public class BodyMassIndex {

    // create a method calculateBMI
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        
        // BMI formula
        double bmi = weight / (height * height);
        
        // Determine the BMI status
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }
        
        // Return the result as an array
        return new String[] {String.format("%.2f", bmi), status};
    }

    // create a method  processBMI
    public static String[][] processBMI(double[][] inputData) {
        String[][] result = new String[10][4];
        
        for (int i = 0; i < inputData.length; i++) {
            double weight = inputData[i][0];
            double height = inputData[i][1];
            String[] bmiAndStatus = calculateBMI(weight, height);
            
            result[i][0] = String.format("%.2f", height);  // Height in cm
            result[i][1] = String.format("%.2f", weight);  // Weight in kg
            result[i][2] = bmiAndStatus[0];                // BMI
            result[i][3] = bmiAndStatus[1];                // Status
        }
        
        return result;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] bmiTable) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < bmiTable.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", bmiTable[i][0], bmiTable[i][1], bmiTable[i][2], bmiTable[i][3]);
        }
        
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] inputData = new double[10][2];  // 2D array to store height and weight

        // take the user inputs for height and weight
        System.out.println("Enter weight (in kg) and height (in cm) for each person:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.print("Enter weight (kg): ");
            inputData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            inputData[i][1] = scanner.nextDouble();
        }

        
        String[][] bmiTable = processBMI(inputData);

        // Display the results in tabular format
        displayResults(bmiTable);
        
        scanner.close();
    }
}

