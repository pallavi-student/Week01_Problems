package Day05.Extras.Level01;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        char mostFrequent = ' ';
        int maxCount = 0;

        for (char c : str.toCharArray()) freq[c]++;
        for (char c : str.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                mostFrequent = c;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
