import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = input.nextInt();

        // Calculate and print the bonus if eligible
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus is: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }
    }
}