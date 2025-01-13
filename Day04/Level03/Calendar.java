import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }
    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        // Check for leap year
        if (isLeapYear(year)) {
            days[1] = 29; // February has 29 days in a leap year
        }
        System.out.println(months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print spaces for indentation
        }
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
        }
        } System.out.println();
    }    public static int getFirstDay(int month, int year) {
        int d = 1; // 1st day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
