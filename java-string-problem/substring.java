import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring manually using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using custom method
        String manualSubstring = createSubstringUsingCharAt(text, start, end);

        // Create substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // Compare both substrings
        boolean areEqual = compareUsingCharAt(manualSubstring, builtInSubstring);

        // Display results
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);

        if (areEqual) {
            System.out.println("✅ Both methods produce the same substring!");
        } else {
            System.out.println("❌ The substrings are different!");
        }

        sc.close();
    }
}
