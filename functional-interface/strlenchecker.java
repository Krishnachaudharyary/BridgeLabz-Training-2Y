import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int charLimit = 50;

        // Function to calculate string length
        Function<String, Integer> getLength = str -> str.length();

        String message = "This is a sample message for checking the length.";

        int length = getLength.apply(message);

        System.out.println("Message length: " + length);

        if (length > charLimit) {
            System.out.println("⚠️ Message exceeds the character limit!");
        } else {
            System.out.println("✅ Message is within the limit.");
        }
    }
}
