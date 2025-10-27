import java.util.Scanner;

public class StringIndexExceptionDemo {

    // Method that generates the exception (without handling)
    public static void generateException(String text) {
        System.out.println("\n--- Generating StringIndexOutOfBoundsException ---");
        // This will cause the program to crash
        char ch = text.charAt(text.length());  // Invalid index
        System.out.println("Character at invalid index: " + ch);
    }

    // Method that demonstrates handling the exception
    public static void handleException(String text) {
        System.out.println("\n--- Handling StringIndexOutOfBoundsException using try-catch ---");
        try {
            // Accessing invalid index
            char ch = text.charAt(text.length());
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠ Exception caught: " + e);
            System.out.println("Message: Attempted to access index beyond the string length!");
        }
        System.out.println("Program continues normally after handling the exception ✅");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First method — generates the exception (will stop the program)
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠ Exception caught in main: " + e);
            System.out.println("Continuing to handle it properly in next method...");
        }

        // Second method — handles the exception using try-catch
        handleException(text);

        sc.close();
    }
}
