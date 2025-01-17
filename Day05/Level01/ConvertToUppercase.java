import java.util.Scanner;

public class ConvertToUppercase {
    // Method to manually convert text to uppercase
    public static String toUpperCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32)); // Convert to uppercase
            } else {
                result.append(c); // Append as-is
            }
        }
        return result.toString();
    }
    // Method to compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // If lengths are different, they can't be equal
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; // If any character is different, return false
            }
        }
        return true; // Strings are equal
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string to convert to uppercase: ");
        String userInput = scanner.nextLine();

        // Convert to uppercase manually and using built-in method
        String manualUpperCase = toUpperCaseManual(userInput);
        String builtInUpperCase = userInput.toUpperCase();
        // Display both results
        System.out.println("Manually converted to uppercase: "+manualUpperCase);
        System.out.println("Using built-in method: " + builtInUpperCase);

        // Compare the results
        boolean areEqual = compareStrings(manualUpperCase, builtInUpperCase);
        // Display comparison result
        if (areEqual) {
            System.out.println("The results match! Both methods produce the same uppercase text.");
        } else {
            System.out.println("The results do not match! Something went wrong.");
        }

        scanner.close(); // Close the scanner
    }
}
