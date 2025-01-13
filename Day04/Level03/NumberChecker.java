import java.util.Arrays;

public class NumberChecker {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
    int count = 0;
    if (number == 0) {
        return 1;
    }    while (number != 0) {
        number /= 10;  
        count++;           }

    return count;
}
    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    // Method to check if a number is a Duck Number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int i=0;i<digits.length;i++)  {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }
    // Method to check if the number is an Armstrong Number using the digits array
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int sum = 0;
        int digitCount = digits.length;
        for (int i=0;i<digits.length;i++)  {
            sum += Math.pow(digits[i], digitCount);
        }
        return sum == originalNumber;
    }
    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0;i<digits.length;i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }
    //smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0;i<digits.length;i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] > smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Example number
        // Store digits of the number
        int[] digits = storeDigits(number);
        //  Find the count of digits
        System.out.println("Count of digits: " + countDigits(number));
        //  Check if the number is a Duck Number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        // Check if the number is an Armstrong Number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, number));
        // Find the largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest Digit: " + largestAndSecondLargest[1]);
        //Find the smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest Digit: " + smallestAndSecondSmallest[1]);
    }
}
