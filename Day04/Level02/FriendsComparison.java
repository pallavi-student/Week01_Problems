import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }
    // Method to find the tallest friend
    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[]names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input age and height for the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = input.nextInt();
        }

        // Calling respective methods
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        // Display
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
