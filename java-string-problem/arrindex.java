import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    // Method that generates the exception (without handling)
    public static void generateException(String[] names) {
        System.out.println("\n--- Generating ArrayIndexOutOfBoundsException ---");
        // Accessing an invalid index — beyond array length
        System.out.println("Accessing index beyond array length...");
        System.out.println("Name at invalid index: " + names[names.length]);
    }

    // Method that demonstrates handling the exception
    public static void handleException(String[] names) {
        System.out.println("\n--- Handling ArrayIndexOutOfBoundsException using try-catch ---");
        try {
            // Access invalid index again
            System.out.println("Name at invalid index: " + names[names.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Exception caught: " + e);
            System.out.println("Message: Attempted to access index beyond array size!");
        } 
        catch (RuntimeException e) { // catches any other runtime exception
            System.out.println("⚠ Runtime Exception caught: " + e);
        }
        System.out.println("Program continues normally after handling the exception ✅");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input from user
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // First method — generates the exception (will crash if not caught)
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠ Exception caught in main: " + e);
            System.out.println("Continuing to proper handling demonstration...");
        }

        // Second method — handles the exception properly
        handleException(names);

        sc.close();
    }
}
