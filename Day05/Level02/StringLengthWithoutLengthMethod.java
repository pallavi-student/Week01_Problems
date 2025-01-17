import java.util.*;

class StringLengthWithoutLengthMethod {
    
    // Method to find and return string length without using length() method
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  // Attempt to access each character until an exception occurs
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When the exception occurs, it means we've reached the end of the string
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Call the user-defined method to get string length
        int length = getStringLength(text);
        System.out.println("Length of the string (without using length()): " + length);
        
        // Call the built-in method to get string length
        System.out.println("Length of the string (using length()): " + text.length());
    }
}
