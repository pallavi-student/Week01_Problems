package Day05.Extras.Level03;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (true) {
            guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (Respond with high, low, or correct)");
            String feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("I guessed your number!");
                break;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid response. Please type high, low, or correct.");
            }
        }
    }
}