import java.util.Random;

public class GradesOfStudent{

    // create a method generateScores
    private static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // 2D array for PCM scores of n students

        for (int i = 0; i < n; i++) {
            scores[i][0] = 50 + rand.nextInt(51); // Random score between 50 and 100 for Physics
            scores[i][1] = 50 + rand.nextInt(51); // Random score between 50 and 100 for Chemistry
            scores[i][2] = 50 + rand.nextInt(51); // Random score between 50 and 100 for Maths
        }

        return scores;
    }

    // create a method calculateTotalAveragePercentage
    private static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] result = new double[scores.length][4]; // 2D array to store total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 3.0) * 100 / 100;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // create a method calculateGrades
    private static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70&&percentage<=79) {
                grades[i] = "B";
            } else if (percentage >= 60&&percentage<=69) {
                grades[i] = "C";
            } else if (percentage >= 50&&percentage<=59) {
                grades[i] = "D";
            }else if(percentage>=40&&percentage<=49){
			grades[i]="E";
			}else if(percentage<=39){
                grades[i] = "R";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    private static void displayScorecard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t", i + 1);
            System.out.printf("%d\t\t", scores[i][0]);
            System.out.printf("%d\t\t", scores[i][1]);
            System.out.printf("%d\t\t", scores[i][2]);

            // Display total, average, percentage, and grade with rounded values
            System.out.printf("%d\t", (int) result[i][0]);
            System.out.printf("%.2f\t", result[i][1]);
            System.out.printf("%.2f%%\t", result[i][2]);
            System.out.println(grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 5; // Number of students
        int[][] scores = generateScores(n); // Generate random scores
        double[][] result = calculateTotalAveragePercentage(scores); // Calculate total, average, percentage
        String[] grades = calculateGrades(result); // Calculate grades
        displayScorecard(scores, result, grades); // Display the scorecard
    }
}
