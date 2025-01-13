import java.util.Scanner;

public class CheckingYear {

    // Method to check for a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is valid only for year >= 1582
        if (year < 1582) {
            return false;
        }
        // Check leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        scanner.close();
    }
}
