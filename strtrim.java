import java.util.Scanner;

public class TrimStringDemo {

    // Method to find start and end index (without spaces)
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = -1;
        boolean charFound = false;

        // find the starting point (first non-space)
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                charFound = true;
                break;
            }
        }

        // find the ending point (last non-space)
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        // If string was all spaces, return default indexes
        if (!charFound) {
            start = 0;
            end = -1;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Get trim indexes
        int[] indexes = findTrimIndexes(input);
        String customTrimmed = "";
        if (indexes[1] >= indexes[0]) {
            customTrimmed = customSubstring(input, indexes[0], indexes[1]);
        }

        // Built-in trim
        String builtInTrimmed = input.trim();

        // Compare results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        // Display results
        System.out.println("\nCustom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both results same? " + isSame);
    }
}
