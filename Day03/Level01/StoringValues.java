import java.util.Scanner;

public class StoringValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers 0 or negative number to stop");
        while (true) {
            double num = scanner.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index++] = num;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal: " + total);
    }
}
