import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check character type: Vowel, Consonant, or Not a Letter
    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c); // Convert character to lowercase for uniformity
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter"; 
    }

    // Method to process string and store character types in a 2D array
    public static String[][] processString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c); // Store character
            result[i][1] = checkCharacterType(c); // Store character type
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] result) {
        System.out.println("Character\tType");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Process the string and get character types
        String[][] result = processString(text);
        
        // Display the result in tabular format
        displayTable(result);
    }
}
