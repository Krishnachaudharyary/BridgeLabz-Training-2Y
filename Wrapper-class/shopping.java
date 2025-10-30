public class ShoppingCart {
    public static void main(String[] args) {
        // Prices stored as strings
        String[] prices = {"250", "499", "99", "abc", "150"};

        int total = 0; // total price

        for (String price : prices) {
            try {
                // Convert string to int using Integer.parseInt()
                int value = Integer.parseInt(price);
                total += value;
            } catch (NumberFormatException e) {
                // Handle invalid prices
                System.out.println("Invalid price skipped: " + price);
            }
        }

        System.out.println("Total price of valid items: " + total);
    }
}
