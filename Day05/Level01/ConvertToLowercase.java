import java.util.Scanner;

public class ConvertToLowercase {
    // Method to manually convert text to lowercase
    public static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >='A' && c <= 'Z') {
                result.append((char) (c + 32)); // Convert to lowercase
            } else {
                result.append(c);             }
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
        System.out.print("Enter a string to convert to lowercase: ");
        String userInput = scanner.nextLine();

        // Convert to lowercase manually and using built-in method
        String manualLowerCase = toLowerCaseManual(userInput);
        String builtInLowerCase = userInput.toLowerCase();

        // Display both results
        System.out.println("Manually converted to lowercase: " + manualLowerCase);
        System.out.println("Using built-in method: " + builtInLowerCase);
        // Compare the results
        boolean areEqual = compareStrings(manualLowerCase, builtInLowerCase);
        // Display comparison result
        if (areEqual) {
            System.out.println("The results match! Both methods produce the same lowercase text.");
        } else {
            System.out.println("The results do not match! Something went wrong.");
        }

        scanner.close(); // Close the scanner
    }
}
