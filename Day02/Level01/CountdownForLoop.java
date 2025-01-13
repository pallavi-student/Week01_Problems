import java.util.Scanner;

public class CountdownForLoop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input starting value for the countdown
        System.out.print("Enter a number to start the countdown: ");
        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket launch!");
    }
}
