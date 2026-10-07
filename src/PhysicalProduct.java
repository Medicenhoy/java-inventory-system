// PhysicalProduct.java
// A concrete product type that extends the abstract Product class.
// Represents a physical item that must be shipped, so it adds a
// shipping weight property on top of the shared product fields.

public class PhysicalProduct extends Product {
    // Extra property specific to physical products
    private double shippingWeight;

    // Constructor: calls the parent constructor with super(), then
    // sets the property that only physical products have.
    public PhysicalProduct(
        int id,
        String name,
        double price,
        int stock,
        double shippingWeight
    ) {
        super(id, name, price, stock);
        this.shippingWeight = shippingWeight;
    }

    // Provides this class's own implementation of the abstract method.
    // @Override tells Java we are replacing the parent's abstract version.
    @Override
    public String getDetails() {
        return String.format(
            "[Physical] %s | R$ %.2f | Stock: %d | Shipping weight: %.2f kg",
            name,
            price,
            stock,
            shippingWeight
        );
    }
}