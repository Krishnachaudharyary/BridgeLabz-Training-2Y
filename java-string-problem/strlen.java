import java.util.Scanner;

public class StringLengthDemo {

    // Method to find string length without using length() method
    public static int findLength(String text) {
        int count = 0;

        try {
            // Infinite loop to count characters until exception occurs
            while (true) {
                text.charAt(count);  // when count exceeds string size, exception will occur
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index goes out of bounds
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find length using custom method
        int customLength = findLength(text);

        // Find length using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength using custom method: " + customLength);
        System.out.print
  }
}