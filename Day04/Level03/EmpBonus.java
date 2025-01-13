import java.util.Random;

public class EmpBonus {

    public static void main(String[] args) {
        int[][] emp = genDetails(); // Generate salary and years of service
        double[][] bonusData = calcBonus(emp); // Calculate bonus and new salary
        display(emp, bonusData); // Display results
    }
    // Generate salary and years of service
    public static int[][] genDetails() {
        int[][] emp = new int[10][2]; // [salary, years of service]
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            emp[i][0] = rand.nextInt(90000) + 10000; // Random 5-digit salary
            emp[i][1] = rand.nextInt(15) + 1; // Random years of service (1-15)
        }
        return emp;
    }
    // Calculate bonus and new salary
    public static double[][] calcBonus(int[][] emp) {
        double[][] res = new double[10][2]; // [bonus, new salary]

        for (int i = 0; i < 10; i++) {
            int sal = emp[i][0];
            int yrs = emp[i][1];
            double pct = yrs > 5 ? 5.0 : 2.0; // Bonus percentage
            double bonus = sal * (pct / 100.0);
            res[i][0] = bonus; // Bonus
            res[i][1] = sal + bonus; // New salary
        }
        return res;
    }
    // Display results
    public static void display(int[][] emp, double[][] bonusData) {
        double totOld = 0, totNew = 0, totBonus = 0;
        System.out.println("Emp OldSalary Years Bonus   NewSalary");
        System.out.println("-------------------------------------");
        for (int i = 0; i < 10; i++) {
            int sal = emp[i][0];
            int yrs = emp[i][1];
            double bonus = bonusData[i][0];
            double newSal = bonusData[i][1];

            totOld += sal;
            totBonus += bonus;
            totNew += newSal;

            System.out.println((i + 1) + "   " + sal + "    " + yrs + "      " + 
                               round(bonus) + "   " + round(newSal));
        }
        System.out.println("-------------------------------------");
        System.out.println("Total: " + totOld + "      " + round(totBonus) + "   " + round(totNew));
    }
        public static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
