import java.util.Scanner;

public class SplitTextDemo {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words using charAt() (manual method)
    public static String[] splitUsingCharAt(String text) {
        int length = findLength(text);

        // Step 1: Count number of words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Step 3: Extract words using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[wordIndex++] = word;
            start = end + 1;
        }

        // Last word after last space
        String lastWord = "";
        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }
        words[wordIndex] = lastWord;

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full line input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split text using custom method
        String[] manualSplit = splitUsingCharAt(text);

        // Split text using built-in split()
        String[] builtInSplit = text.split(" ");

        // Compare both arrays
        boolean areEqual = compareArrays(manualSplit, builtInSplit);

        // Display results
        System.out.println("\nWords using charAt() method:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both split results equal? " + areEqual);

        if (areEqual) {
            System.out.println("✅ Both methods produce the same result!");
        } else {
            System.out.println("❌ The results are different!");
        }

        sc.close();
    }
}
