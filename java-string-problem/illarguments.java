import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method that generates the exception (no handling)
    public static void generateException(String text) {
        System.out.println("\n--- Generating IllegalArgumentException ---");
        // start index > end index → throws IllegalArgumentException
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }

    // Method that demonstrates handling the exception
    public static void handleException(String text) {
        System.out.println("\n--- Handling IllegalArgumentException using try-catch ---");
        try {
            // start index > end index again to cause exception
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("⚠ Exception caught: " + e);
            System.out.println("Message: Start index cannot be greater than end index!");
        } 
        catch (RuntimeException e) { // generic catch for other runtime errors
            System.out.println("⚠ Runtime Exception caught: " + e);
        }
        System.out.println("Program continues normally after handling the exception ✅");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First method — generates the exception (will crash if not caught)
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("⚠ Exception caught in main: " + e);
            System.out.println("Continuing to proper handling demonstration...");
        }

        // Second method — handles the exception properly
        handleException(text);

        sc.close();
    }
}
