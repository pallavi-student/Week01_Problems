import java.util.Scanner;

public class StringTrimmer {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    // Method to create substring from start to end index
    public static String createSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = scanner.nextLine();

        // Trimming spaces
        int[] trimmedIndexes = trimSpaces(text);
        String trimmedText = createSubstring(text, trimmedIndexes[0], trimmedIndexes[1]);

        // Built-in trim
        String builtInTrimmed = text.trim();

        // Compare
        System.out.println("Trimmed with charAt(): \"" + trimmedText + "\"");
        System.out.println("Trimmed with trim(): \"" + builtInTrimmed + "\"");
        System.out.println(trimmedText.equals(builtInTrimmed) ? "Both are same" : "Different");
    }
}
