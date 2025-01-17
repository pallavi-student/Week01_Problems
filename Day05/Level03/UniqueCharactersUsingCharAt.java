package Day05.Level03;

import java.util.Scanner;

public class UniqueCharactersUsingCharAt {

    // create a method getStringLength
    public static int getStringLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // create a method findUniqueCharacters
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);  // Get length of the text
        char[] uniqueChars = new char[length];
        int index = 0;
        
        // Loop to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // Check if currentChar is unique by comparing with previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            // If the character is unique, store it in the result array
            if (isUnique) {
                uniqueChars[index] = currentChar;
                index++;
            }
        }
        
        // Create a new array of exact size to store unique characters
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    // create a method displayUniqueCharacters 
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.println("Unique characters in the string are:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        
        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);
        
        // Display the unique characters
        displayUniqueCharacters(uniqueChars);

        scanner.close();
    }
}