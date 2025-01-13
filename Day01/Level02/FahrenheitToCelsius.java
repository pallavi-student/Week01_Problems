import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
