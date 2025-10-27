import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using custom method
        boolean customResult = compareUsingCharAt(str1, str2);

        // Compare using built-in equals()
        boolean equalsResult = str1.equals(str2);

        // Display results
        System.out.println("\nComparison using charAt(): " + customResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Check if both methods give the same result
        if (customResult == equalsResult) {
            System.out.println("✅ Both methods give the same result!");
        } else {
            System.out.println("❌ The results are different!");
        }

        sc.close();
    }
}
