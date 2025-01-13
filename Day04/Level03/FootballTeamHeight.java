import java.util.Scanner;

public class FootballTeamHeight {
    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int i=0;i<heights.length;i++) {
            sum += heights[i];
        }
        return sum;
    }
    // Method to calculate the mean height of the players
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }
    // Method to find the shortest height in the array
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i=0;i<heights.length;i++){
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
    // Method to find the tallest height in the array
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i=0;i<heights.length;i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
    public static void main(String[] args) {
        // Array to store the heights of 11 players
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // value between 150 and 250
        }
        // Calculate sum, mean, shortest, and tallest heights
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        // Display the results
        System.out.println("Heights of players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " +i + 1 + ": " + heights[i] + " cm");
        }
        System.out.println("\nTotal sum of heights: " + sum + " cm");
        System.out.println("Mean height: "  + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
