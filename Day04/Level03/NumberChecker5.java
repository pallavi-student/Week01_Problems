public class NumberChecker5 {
    //find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    //find the greatest factor
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    //find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // find the product of cubes 
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int i=0;i<factors.length;i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }
    //check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    //check if a number is an abundant number
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }
    // check if a number is a deficient number
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }
    //check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    //  calculate factorial of a number
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int number = 28; // Example number for testing
        // Find factors
        int[] factors = findFactors(number);
        // Find greatest factor
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        // Find the sum of factors
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        // Find the product of factors
        System.out.println("Product of Factors: " + productOfFactors(factors));
        // Find the product of cubes
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
        // Check number is a perfect number
        System.out.println("Is Perfect: " + isPerfect(number));
        // Check  is an abundant number
        System.out.println("Is Abundant: " + isAbundant(number));
        // Check  number is a deficient number
        System.out.println("Is Deficient: " + isDeficient(number));
        // Check number is a strong number
        System.out.println("Is Strong Number: " + isStrongNumber(number));
        int anotherNumber = 145;
        System.out.println("\nTesting with number " + anotherNumber + ":");
        System.out.println("Is Strong Number: " + isStrongNumber(anotherNumber));
    }
}
