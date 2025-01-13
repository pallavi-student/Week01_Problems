import java.util.Scanner;

public class QuadraticRoots {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta))/(2 * a);
            double root2 = (-b - Math.sqrt(delta))/(2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b /(2*a);
            return new double[]{root};
        } else {
            //No roots
            return new double[]{};
        }
    }public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();

        // a is not zero for quadratic equation else it becom linear one
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
            return;
        }
        double[] roots=findRoots(a, b, c);
        // Display
        if (roots.length== 2) {
            System.out.println("The roots of the equation are "+roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is " + roots[0]);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
