import java.util.Scanner;
public class EuclideanDistanceAndLine {
    // Method to calculate the Euclidean distance between two points
    public static double calcDist(double x1, double y1, double x2, double y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;
    }
    // Method to find the equation of the line 
    public static double[] findLineEq(double x1, double y1, double x2, double y2) {
        // Calculating the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculating the y-intercept (b)
        double b = y1 - m * x1;
        
             return new double[] { m, b };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input for the first point (x1, y1)
        System.out.println("Enter coordinates of first point (x1, y1):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        // Taking input for the second poin
        System.out.println("Enter coordinates of second point (x2, y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        //the Euclidean distance
        double dist = calcDist(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + dist);
        // Finding the equation of the line
        double[] eq = findLineEq(x1, y1, x2, y2);
        // Outputting
        System.out.println("Line Equation: y = " + eq[0] + "x + " + eq[1]);
        
        sc.close();
    }
}
