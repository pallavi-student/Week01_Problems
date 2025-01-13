import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ages and heights for Amar, Akbar, and Anthony
        System.out.print("Enter Amar age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Amar height: ");
        double heightAmar = input.nextDouble();

        System.out.print("Enter Akbar age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Akbar height: ");
        double heightAkbar = input.nextDouble();

        System.out.print("Enter Anthony age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Anthony height: ");
        double heightAnthony = input.nextDouble();

        // Find the youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar"
                : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        // Find the tallest
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar"
                : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + ")");
    }
}