// DigitalProduct.java
// A concrete product type that extends the abstract Product class.
// Represents a digital item (like software or an e-book) that has a
// file size and does not require shipping.

public class DigitalProduct extends Product {
    // Extra property specific to digital products
    private double fileSizeMb;

    // Constructor: calls the parent constructor with super(), then
    // sets the property that only digital products have.
    public DigitalProduct(
        int id,
        String name,
        double price,
        int stock,
        double fileSizeMb
    ) {
        super(id, name, price, stock);
        this.fileSizeMb = fileSizeMb;
    }

    // This class's own version of the abstract method. Notice there is
    // no shipping information, because digital products are not shipped.
    @Override
    public String getDetails() {
        return String.format(
            "[Digital] %s | R$ %.2f | Stock: %d | File size: %.1f MB",
            name,
            price,
            stock,
            fileSizeMb
        );
    }
}