import java.util.Scanner;

public class LowercaseCompare {

    // Method to convert uppercase letters to lowercase using charAt()
    public static String convertToLowercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase ('A' to 'Z'), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII difference between uppercase and lowercase is 32
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

        // Take complete line input from user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Convert text to lowercase using custom method
        String manualLowercase = convertToLowercase(text);

        // Convert text to lowercase using built-in method
        S
