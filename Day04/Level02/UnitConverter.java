public class UnitConverter {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Fahrenheit to Celsius- " + convertFahrenheitToCelsius(98.6));
        System.out.println("Celsius to Fahrenheit- " + convertCelsiusToFahrenheit(37));
        System.out.println("Pounds to Kilograms- " + convertPoundsToKilograms(150));
        System.out.println("Kilograms to Pounds- " + convertKilogramsToPounds(68));
        System.out.println("Gallons to Liters- " + convertGallonsToLiters(10));
        System.out.println("Liters to Gallons- " + convertLitersToGallons(3.78541));
    }
}
