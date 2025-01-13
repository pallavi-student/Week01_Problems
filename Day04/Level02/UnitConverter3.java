public class UnitConverter3 {

    // Convert Yards to Feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Convert Meters to Inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Convert Inches to Meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Convert Inches to Centimeters
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Yards to Feet: " + convertYardsToFeet(5));
        System.out.println("Feet to Yards: " + convertFeetToYards(15));
        System.out.println("Meters to Inches: " + convertMetersToInches(2));
        System.out.println("Inches to Meters: " + convertInchesToMeters(78));
        System.out.println("Inches to Centimeters: " + convertInchesToCm(12));
    }
}
