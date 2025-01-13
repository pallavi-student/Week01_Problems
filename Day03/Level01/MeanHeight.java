import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter heights of 11 players:");
        // Calculating sum of numbers of array using for loop
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        // calculating mean of a numbers
        double mean = sum / 11;
        System.out.println("Mean Height: " + mean);
    }
}
