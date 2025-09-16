class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost
    double totalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemMain {
    public static void main(String[] args) {
        Item item1 = new Item(201, "Laptop", 55000.0);
        item1.displayItem();
        int quantity = 3;
        System.out.println("Total cost for " + quantity + " items: " + item1.totalCost(quantity));
    }
}
