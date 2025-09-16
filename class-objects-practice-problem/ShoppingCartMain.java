import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate cost for this item
    double getCost() {
        return price * quantity;
    }

    // Display item details
    void displayItem() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getCost());
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    // Add item to cart
    void addItem(String name, double price, int quantity) {
        cart.add(new CartItem(name, price, quantity));
        System.out.println(quantity + " x " + name + " added to cart.");
    }

    // Remove item from cart (by name)
    void removeItem(String name) {
        boolean removed = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(name)) {
                cart.remove(i);
                System.out.println(name + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in cart!");
        }
    }

    // Display total cost
    void displayTotal() {
        double total = 0;
        System.out.println("\n--- Cart Items ---");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getCost();
        }
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n===== Shopping Cart Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart & Total");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayTotal();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
