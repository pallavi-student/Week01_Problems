public class NumberChecker2 {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        // Count digits         
         while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    //the sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    // Method to find the sum of the squares of the digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);  // Square the digit and add to sum
        }
        return sum;
    }
    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sumOfDigits = sumOfDigits(digits);
        return originalNumber % sumOfDigits == 0;
    }
    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // 10 digits (0-9), first column for digit, second for frequency

        // Initialize
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }
    public static void main(String[] args) {
        int number = 21; 
        //Store digits 
        int[] digits = storeDigits(number);
        //count of digits
        System.out.println("Count of digits: " + countDigits(number));
        //sum of the digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        //sum of the squares of the digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        // is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(digits, number));
        // frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
    }
}
