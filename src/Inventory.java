// Inventory.java
// Manages the store's product catalog using a HashMap from the
// Java Collection Framework. The HashMap stores each product keyed
// by its unique ID, which allows fast lookup, insertion, and removal.

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    // HashMap: the key is the product ID (Integer), the value is the
    // Product object. This is the required data structure.
    private Map<Integer, Product> products = new HashMap<>();

    // Adds a product to the inventory.
    // Throws an exception if a product with the same ID already exists.
    public void addProduct(Product product) {
        if (products.containsKey(product.getId())) {
            throw new IllegalArgumentException(
                "A product with ID " + product.getId() + " already exists."
            );
        }
        products.put(product.getId(), product);
        System.out.println("Added: " + product.getName());
    }

    // Searches for a product by its ID. Returns the product, or null
    // if no product with that ID is found.
    public Product findProduct(int id) {
        return products.get(id);
    }

    // Updates the stock level of a product found by its ID.
    // Throws an exception if the product does not exist.
    public void updateStock(int id, int newStock) {
        Product product = products.get(id);
        if (product == null) {
            throw new IllegalArgumentException(
                "No product found with ID " + id + "."
            );
        }
        product.setStock(newStock);
        System.out.println(
            "Updated stock for " + product.getName() + " to " + newStock
        );
    }

    // Displays all products in the inventory by looping through the
    // HashMap values and calling each product's getDetails() method.
    public void displayAll() {
        System.out.println("\n--- Current Inventory ---");
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
            return;
        }
        // Loop through every product in the HashMap
        for (Product product : products.values()) {
            System.out.println(product.getDetails());
        }
    }

    // Calculates the total value of the inventory (price times stock
    // for every product), using a loop to add them all up.
    public double calculateTotalValue() {
        double total = 0.0;
        for (Product product : products.values()) {
            total += product.getPrice() * product.getStock();
        }
        return total;
    }
}