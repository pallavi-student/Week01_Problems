public class UnitConverter2 {

    // Convert Kilometers to Miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Convert Miles to Kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Convert Meters to Feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Convert Feet to Meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Kilometers to Miles: " + convertKmToMiles(10));
        System.out.println("Miles to Kilometers: " + convertMilesToKm(6.21));
        System.out.println("Meters to Feet: " + convertMetersToFeet(3));
        System.out.println("Feet to Meters: " + convertFeetToMeters(9.84));
    }
}
