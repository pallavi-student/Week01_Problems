import java.util.Scanner;

public class FindLargestNumbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize variables
        int maxDigit = 10; // Initial size of the digits array
        int[] digits = new int[maxDigit];
        int index = 0;

        // adding digits from the number
        while (number != 0) {
            // If index reaches maxDigit, increase the size of the array
            if (index == maxDigit) {
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a new temp array with the larger size
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy old data to temp
                digits = temp; // Assign temp to digits
            }

            // Store the last digit in the array
            digits[index] = number%10;
            number/= 10; // Remove the last digit from the number
            index++;
        }

        // Find the largest and secondlargest digits
        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second-largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second-largest if it not equal to largest
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: "+secondLargest);
    }
}
