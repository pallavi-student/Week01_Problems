package Day05.Level03;

import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If lengths are not equal, they can't be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Convert both texts to lower case to make the comparison case-insensitive
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        // Create an array to store frequency of characters
        int[] charCount = new int[26];

        // Count the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            charCount[text1.charAt(i) - 'a']++;
            charCount[text2.charAt(i) - 'a']--;
        }

        // Check if all counts are zero, meaning both texts are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check and display result
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}