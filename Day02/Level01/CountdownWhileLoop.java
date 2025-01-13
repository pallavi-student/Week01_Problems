import java.util.Scanner;

public class CountdownWhileLoop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input starting value for the countdown
        System.out.print("Enter a number to start the countdown: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket launch!");
    }
}
