package Day05.Level03;

import java.util.Scanner;

public class IsPalindrome{

    // Method to check palindrome using loop
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method to check palindrome
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        // Base case: if the start index is greater than or equal to end index, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If characters at the start and end are not the same, it's not a palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursively call the method with the next start and previous end
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3: Method to check palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        // Convert the string to character array
        char[] originalArray = text.toCharArray();
        
        // Create a reverse character array
        char[] reverseArray = new char[originalArray.length];
        int j = 0;
        for (int i = originalArray.length - 1; i >= 0; i--) {
            reverseArray[j] = originalArray[i];
            j++;
        }

        // Compare the original and reverse arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Using loop
        boolean isPalindromeLoop = isPalindromeUsingLoop(inputText);
        System.out.println("Palindrome check using loop: " + (isPalindromeLoop ? "Yes" : "No"));

        // Using recursion
        boolean isPalindromeRecursion = isPalindromeUsingRecursion(inputText, 0, inputText.length() - 1);
        System.out.println("Palindrome check using recursion: " + (isPalindromeRecursion ? "Yes" : "No"));

        // Using character arrays
        boolean isPalindromeCharArray = isPalindromeUsingCharArray(inputText);
        System.out.println("Palindrome check using character array: " + (isPalindromeCharArray ? "Yes" : "No"));

        sc.close();
    }
}