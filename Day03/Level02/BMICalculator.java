import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
           
                System.out.print("Enter weight (kg ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] > 0) break;
                System.out.println("Invalid weight. Please enter again.");
            

           
                System.out.print("Enter height m ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] > 0) break;
                System.out.println("Invalid height. Please enter again.");
            

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        // Display results
        System.out.println("Weight     Height     BMI        Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personData[i][0] + "     " 
                    + personData[i][1] + "     " 
                    + personData[i][2] + "     " 
                    + weightStatus[i]);
        }
    }
}
