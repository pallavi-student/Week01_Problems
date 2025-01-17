import java.util.*;

class SplitTextWithoutSplitMethod {
    // Method to split text into words without using the split() method
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        ArrayList<Integer> spaceIndexes = new ArrayList<>();
        
        // Count spaces to estimate the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes.add(i);
                wordCount++;
            }
        }
        wordCount++;
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i == wordCount - 1) ? text.length() : spaceIndexes.get(i);
            words[i] = text.substring(start, end);
            start = end + 1;
        }
        return words;
    }
    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        // User-defined method
        String[] userSplit = splitTextIntoWords(text);
        // Built-in method
        String[] builtInSplit = text.split(" ");  
        // Compare and display results
        boolean areEqual = compareArrays(userSplit, builtInSplit);
        System.out.println("Words from user-defined method: " + Arrays.toString(userSplit));
        System.out.println("Words from built-in method: " + Arrays.toString(builtInSplit));
        System.out.println("Are both splits the same? " + areEqual);
    }
}
