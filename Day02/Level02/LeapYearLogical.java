import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input year from the user
        System.out.print("Enter a year (year >= 1582): ");
        int year = input.nextInt();

        // Check if the year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("Invalid year. The Gregorian calendar started in 1582.");
        } else {
            // Single condition to check if it's a Leap Year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}