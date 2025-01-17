import java.util.*;

class VowelsAndConsonants {

    // Method to check if a character is a vowel or consonant
    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) != -1) return "Vowel";
        if ((c >= 'a' && c <= 'z')) return "Consonant";
        return "Not a Letter";
    }

    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type = checkCharacterType(c);
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Call the user-defined method to count vowels and consonants
        int[] counts = countVowelsConsonants(text);
        
        // Display the result
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
