public class NumberChecker3 {
    // count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        if (number == 0) return 1;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    //store the digits of the number 
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    //reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    //compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
    // check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    //check if a number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i=0;i<digits.length;i++) {
            if (digits[i] != 0) return true; // Duck number has at least one nonzero digit
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 12340;
        // Store digits
        int[] digits = storeDigits(number);
        // Find count of digits
        System.out.println("Count of digits: " + countDigits(number));
        // Check  number is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        // Check if  number is a Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        // Reverse the digits and print the reversed number
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();
    }
}
