package Day05.Level03;


import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // create a method uniqueCharacters
    public static char[] uniqueCharacters(String text) {
        // Create an array to store the unique characters
        char[] tempArray = new char[text.length()];
        int index = 0;

        // Loop through the text and find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character already exists in tempArray
            for (int j = 0; j < index; j++) {
                if (tempArray[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the array
            if (isUnique) {
                tempArray[index] = currentChar;
                index++;
            }
        }

        // Create a new array to return only the unique characters
        char[] uniqueChars = new char[index];
        System.arraycopy(tempArray, 0, uniqueChars, 0, index);
        return uniqueChars;
    }

    // Method to find the frequency of characters in a string using unique characters
    public static String[][] findCharacterFrequency(String text) {
        // Array to store the frequency of characters (256 for all ASCII characters)
        int[] charFrequency = new int[256];

        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Find the unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store them and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Character
            result[i][1] = String.valueOf(charFrequency[uniqueChars[i]]);  // Frequency
        }

        return result;
    }

    // create a method displayCharacterFrequency
    public static void displayCharacterFrequency(String[][] freqTable) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        
        for (int i = 0; i < freqTable.length; i++) {
            System.out.println(freqTable[i][0] + "        | " + freqTable[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();
        
        // Find the frequency of characters
        String[][] frequencyTable = findCharacterFrequency(inputText);
        
        // Display the frequency of characters
        displayCharacterFrequency(frequencyTable);

        sc.close();
    }
}

