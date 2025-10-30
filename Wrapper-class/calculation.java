public class ShoppingCartPriceCalculation {
    public static void main(String[] args) {
        // Prices stored as strings
        String[] prices = {"250", "499", "99", "abc", "150"};

        int total = 0; // variable to store total price

        for (String price : prices) {
            try {
                // Convert string to integer using wrapper class method
                int value = Integer.parseInt(price);
                total += value;
            } catch (NumberFormatException e) {
                // Handle invalid price input
                System.out.println("Invalid price skipped: " + price);
            }
        }

        // Display total of valid prices
        System.out.println("Total price of valid items: " + total);
    }
}
