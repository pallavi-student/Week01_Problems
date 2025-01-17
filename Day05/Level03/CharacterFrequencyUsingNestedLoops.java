package Day05.Level03;

import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    // create a method findCharacterFrequency
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] chars = text.toCharArray();
        
        // Array to store frequency of characters (initialize all to 0)
        int[] frequency = new int[chars.length];
        
        // Array to store the result of characters and their frequencies
        String[] result = new String[chars.length];
        
        // Outer loop to iterate through each character in the text
        for (int i = 0; i < chars.length; i++) {
            // If this character is already counted (frequency != 0), skip it
            if (frequency[i] != 0) {
                continue;
            }

            // Initialize frequency of this character to 1
            frequency[i] = 1;
            
            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                // If a duplicate character is found, increment the frequency
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    // Set the duplicate character to '0' to avoid counting again
                    frequency[j] = 0;
                }
            }

            // Store the character and its frequency in the result array
            result[i] = chars[i] + ": " + frequency[i];
        }

        // Return the result array containing characters and their frequencies
        return result;
    }

    // Method to display the frequencies of characters
    public static void displayCharacterFrequency(String[] freqTable) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");

        // Loop through the frequency table and display the result
        for (String entry : freqTable) {
            // Print the character and frequency if the entry is not null
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();
        
        // Find the frequency of characters
        String[] frequencyTable = findCharacterFrequency(inputText);
        
        // Display the frequency of characters
        displayCharacterFrequency(frequencyTable);

        sc.close();
    }
}