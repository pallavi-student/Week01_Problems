package Day05.Extras.Level01;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order.");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " comes after " + str2 + " in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
