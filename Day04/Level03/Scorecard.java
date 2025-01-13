import java.util.Random;
public class Scorecard {
    public static void main(String[] args) {
        int students = 5; 
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
    //random scores
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; // 3 subjects Physics, Chemistry, Math
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(41) + 60; 
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }
    // Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Total, Average, Percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100) / 100.0;
            results[i][2] = Math.round(percentage * 100) / 100.0;
        }
        return results;
    }
    // Display 
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Roll\tPhysics\tChem\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2]);
        }
    }
} // tab operator give 8 spaces 
