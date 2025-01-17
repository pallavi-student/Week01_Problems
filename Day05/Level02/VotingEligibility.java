import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) { // Validate age for a negative number
                result[i][1] = "false (Invalid age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "true (Can vote)";
            } else {
                result[i][1] = "false (Cannot vote)";
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s %-20s\n", "Age", "Voting Eligibility");
        System.out.println("-------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-20s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Generate ages for n students
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Display results
        displayResults(results);

        scanner.close();
    }
}
