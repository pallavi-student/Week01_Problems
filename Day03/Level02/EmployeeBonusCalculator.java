import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            // Input salary
          
                System.out.print("Enter salary for employee " + i + 1 + " ");
                salaries[i] = scanner.nextDouble();
                if (salaries[i] > 0) break; // Valid salary
                System.out.println("Invalid salary. Please enter again.");
            

            // Input years of service
            
                System.out.print("Enter years of service for employee " + i + 1 + " ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] >= 0) break; // Valid years of service
                System.out.println("Invalid years of service. Please enter again.");
            
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // show results
        System.out.println("Employee Details:");
for (int i = 0; i < 10; i++) {
    System.out.println("Employee " + i + 1 + " Old Salary = " + salaries[i] 
            + ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
}
System.out.println("Total Old Salary: " + totalOldSalary);
System.out.println("Total Bonus: " + totalBonus);
System.out.println("Total New Salary: " + totalNewSalary);}}
