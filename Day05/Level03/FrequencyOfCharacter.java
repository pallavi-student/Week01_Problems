package Day05.Level03;

import java.util.Scanner;

public class FrequencyOfCharacter{

    // create a method findCharacterFrequency
    public static String[][] findCharacterFrequency(String text) {
        
        int[] charFrequency = new int[256];
        
        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }
        
        // Count how many unique characters are present
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Loop through the frequency array and store characters with their frequencies
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Character
                result[index][1] = String.valueOf(charFrequency[i]);  // Frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the frequency of characters
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