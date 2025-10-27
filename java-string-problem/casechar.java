import java.util.Scanner;

public class UppercaseCompare {

    // Method to convert lowercase letters to uppercase using charAt()
    public static String convertToUppercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase ('a' to 'z'), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // difference between ASCII values of lowercase and uppercase
            }

            result += ch; // Append the converted or unchanged character
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

        // Take complete line input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Convert text using custom method
        String manualUppercase = convertToUppercase(text);

        // Convert text using built-in method
        String builtInUppercase = text.toUpperCase();

        // Compare both uppercase results
        boolean areEqual = compareUsingCharAt(manualUppercase, builtInUppercase);

        // Display results
        System.out.println("\nUppercase using charAt(): " + manualUppercase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUppercase);
        System.out.println("\nAre both uppercase conversions equal? " + areEqual);

        if (areEqual) {
            System.out.println("✅ Both methods produce the same uppercase result!");
        } else {
            System.out.println("❌ The results are different!");
        }

        sc.close();
    }
}
