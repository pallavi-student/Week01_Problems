import java.util.Scanner;

// Class to check voting eligibility
public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input age
        System.out.print("Enter the person's age: ");
        int personAge = input.nextInt();

        // Check if the person can vote
        boolean canVote = personAge >= 18;

        // Print the result
        if (canVote) {
            System.out.println("The person's age is " + personAge + " and can vote.");
        } else {
            System.out.println("The person's age is " + personAge + " and cannot vote.");
        }
    }
}