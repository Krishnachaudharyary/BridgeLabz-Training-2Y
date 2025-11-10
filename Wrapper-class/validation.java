public class UserInputValidation {

    // Method to validate age input
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input); // Convert string to int

            // Check if age is 18 or older
            if (age >= 18) {
                return true;
            } else {
                System.out.println("User must be 18 or older.");
                return false;
            }
        } catch (NumberFormatException e) {
            // Handle invalid (non-integer) input
            System.out.println("Invalid age input: " + input);
            return false;
        }
    }

    public static void main(String[] args) {
        // Test cases
        String[] testInputs = {"21", "17", "abc", "25"};

        for (String input : testInputs) {
            System.out.println("Input: \"" + input + "\" → Valid: " + isValidAge(input));
        }
    }
}
