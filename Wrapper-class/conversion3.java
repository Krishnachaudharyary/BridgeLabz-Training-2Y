public class InputConversionUtility {
    
    // Method to safely parse integer from string
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input); // try to convert string to int
        } catch (NumberFormatException e) {
            return -1; // return -1 if conversion fails
        }
    }

    public static void main(String[] args) {
        // Test inputs
        String[] testInputs = {"123", "abc", "45.6", "0"};

        for (String input : testInputs) {
            int result = safeParseInt(input);
            System.out.println("Input: \"" + input + "\" → Output: " + result);
        }
    }
}
