package Day05.Level03;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // create a method findFirstNonRepeatingCharacter
    public static char findFirstNonRepeatingCharacter(String text) {
         
        int[] charFrequency = new int[256];
        
        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }
        
        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar;  // Return the first non-repeating character
            }
        }
        
        
        return '\0';  // Return null character to indicate no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();
        
        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);
        
        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}