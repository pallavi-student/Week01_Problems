public class CollinearCheck {
    public static void main(String[] args) {
        // Example points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;
        System.out.println("Using Slope Formula:");
        if (isCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
        System.out.println("Using Area Formula:");
        if (isCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
    // check collinarity using slope formula
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Check if slopes of AB, BC, and AC are equal
       double slopeAB = (double) (y2 - y1) / (x2 - x1); // Slope AB
        double slopeBC = (double) (y3 - y2) / (x3 - x2); // Slope BC
        double slopeAC = (double) (y3 - y1) / (x3 - x1); // Slope AC

        return slopeAB == slopeBC && slopeBC == slopeAC; // Check equality
    }
    // Method to check collineaity using area of triangle formula
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // If area is 0, points are collinear
    }
}
