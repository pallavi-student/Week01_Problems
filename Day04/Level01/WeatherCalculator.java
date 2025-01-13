import java.util.Scanner;

public class WeatherCalculator {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        // Get input for wind speed
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();
        if (windSpeed < 0) {
            System.out.println("Wind speed must be non-negative.");
            return;
        }// Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Print the result
        System.out.println("The wind chill temperature in degrees Fahrenheit is: " + windChill);
    }
}
