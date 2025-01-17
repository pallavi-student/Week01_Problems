public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius of Earth in kilometers
        double radiusMiles = radiusKm * 0.621371; // Convert to miles
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3); // Volume in km^3
        double volumeMiles3 = (4.0/ 3) * Math.PI * Math.pow(radiusMiles, 3); // Volume in miles^3

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic miles is + volumeMiles3");
    }
}