// Main.java
// Entry point of the inventory management program.
// Demonstrates creating products, adding them to the inventory,
// searching, updating stock, handling errors, and calculating the
// total inventory value.

public class Main {
    // The main method is where the program starts running.
    public static void main(String[] args) {
        System.out.println("=== Java Inventory Management System ===");

        // Create the inventory that will hold all products
        Inventory inventory = new Inventory();

        // Create products of both types. Notice we store them as Product
        // (the parent type), even though they are really PhysicalProduct
        // or DigitalProduct. This is polymorphism in action.
        Product laptop = new PhysicalProduct(1, "Laptop", 3500.0, 10, 2.5);
        Product mouse = new PhysicalProduct(2, "Wireless Mouse", 80.0, 50, 0.2);
        Product ebook = new DigitalProduct(3, "E-book: Learn Java", 45.0, 999, 8.5);
        Product antivirus = new DigitalProduct(4, "Antivirus License", 120.0, 500, 150.0);

        // Add all products to the inventory
        inventory.addProduct(laptop);
        inventory.addProduct(mouse);
        inventory.addProduct(ebook);
        inventory.addProduct(antivirus);

        // Display the full inventory. Each product shows different details
        // depending on whether it is physical or digital.
        inventory.displayAll();

        // Demonstrate searching for a product by its ID
        System.out.println("\n--- Searching for product with ID 3 ---");
        Product found = inventory.findProduct(3);
        if (found != null) {
            System.out.println("Found: " + found.getDetails());
        } else {
            System.out.println("Product not found.");
        }

        // Demonstrate updating the stock of a product
        System.out.println("\n--- Updating stock ---");
        inventory.updateStock(1, 7);

        // Demonstrate error handling: try to add a product with an
        // existing ID, and try to update a product that does not exist.
        System.out.println("\n--- Testing error handling ---");
        try {
            Product duplicate = new PhysicalProduct(1, "Duplicate Laptop", 3000.0, 5, 2.0);
            inventory.addProduct(duplicate);
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }

        try {
            inventory.updateStock(99, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }

        // Calculate and display the total value of the inventory
        System.out.println("\n--- Inventory summary ---");
        double totalValue = inventory.calculateTotalValue();
        System.out.printf("Total inventory value: R$ %.2f%n", totalValue);

        System.out.println("\nDone!");
    }
}