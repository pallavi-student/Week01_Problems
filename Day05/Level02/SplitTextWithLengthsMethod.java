import java.util.*;

class SplitTextWithLengthsMethod {
    
    // Method to split text into words without using split() 
    //and return 2D array of words and their lengths
    public static String[][] splitTextWithLengths(String text) {
        String[] words = splitTextIntoWords(text);
        String[][] result = new String[words.length][2];
        
        // 2D array with words and their lengths
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    // Method to split text into words
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
        
        // Extract words using the space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i == wordCount - 1) ? text.length() : spaceIndexes.get(i);
            words[i] = text.substring(start, end);
            start = end + 1;
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();
        
        // Call user-defined method to split text and get word lengths
        String[][] result = splitTextWithLengths(text);
        
        //the result in tabular format
        System.out.println("Word\t\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
