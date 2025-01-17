import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel or consonant
    public static String checkCharacterType(char c) {
        // Convert character to lowercase if it is uppercase
        c = Character.toLowerCase(c);

        // Check if the character is a vowel
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }

        // Check if the character is a consonant
        else if ((c >= 'a' && c <= 'z')) {
            return "Consonant";
        }

        // If it's not a letter, return Not a Letter
        else {
            return "Not a Letter";
        }
    }

    // Method to find the count of vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Iterate through the string using charAt() method
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Check if the character is a vowel or consonant
            String result = checkCharacterType(c);

            // Increment the respective counters based on the character type
            if (result.equals("Vowel")) {
                vowelsCount++;
            } else if (result.equals("Consonant")) {
                consonantsCount++;
            }
        }

        // Return the counts as an array
        return new int[]{vowelsCount, consonantsCount};
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);

        // Display the result
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);
    }
}
