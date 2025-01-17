import java.util.*;

class SplitTextAndFindShortestLongest {

    // This method splits the text into words by checking for spaces between words.
        public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        ArrayList<Integer> spaceIndexes = new ArrayList<>();

        // Counting spaces to estimate how many words are there.
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes.add(i);
                wordCount++;
            }
        }
        wordCount++; // Adding one more for the last word which is not followed by space
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i == wordCount - 1) ? text.length() : spaceIndexes.get(i);
            words[i] = text.substring(start, end);
            start = end + 1;
        }
        return words;
    }

    // This method calculates the length of a string without using the length() method.
      public static int getStringLength(String word) {
        int count = 0;
        try {
            // Keep accessing characters until we run out of characters
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
                       return count;
        }
    }

    // This method returns a 2D array where each row contains a word and  length.
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordWithLengths[i][0] = words[i];
            wordWithLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordWithLengths;
    }

    // This method takes a 2D array and finds the shortest and longest word     public static String[] findShortestAndLongest(String[][] wordWithLengths) {
        String shortestWord = wordWithLengths[0][0];
        String longestWord = wordWithLengths[0][0];

        // Looping
        for (String[] wordInfo : wordWithLengths) {
            if (Integer.parseInt(wordInfo[1]) < getStringLength(shortestWord)) {
                shortestWord = wordInfo[0];
            }
            if (Integer.parseInt(wordInfo[1]) > getStringLength(longestWord)) {
                longestWord = wordInfo[0];
            }
        }
        return new String[]{shortestWord, longestWord};
    }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        //Split
        String[] words = splitTextIntoWords(text);

        // Step 2: Get words with their lengths in a 2D array
        String[][] wordWithLengths = getWordsAndLengths(words);

        //Find the shortest and longest word
        String[] shortestAndLongest = findShortestAndLongest(wordWithLengths);
         //Display
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
    }
}
