// Product.java
// Abstract base class for all products in the inventory.
// It defines the properties and behavior that every product shares,
// but it cannot be instantiated directly. Subclasses must extend it
// and provide their own version of the abstract getDetails() method.

public abstract class Product {
    // Protected fields are accessible by subclasses that extend this class
    protected int id;
    protected String name;
    protected double price;
    protected int stock;

    // Constructor: sets up the shared properties for any product
    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter methods let other classes read these private-ish values
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Updates the stock level for this product
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Abstract method: every subclass MUST provide its own implementation.
    // This is what makes each product type describe itself differently.
    public abstract String getDetails();
}