class Product {
    private double price;  // Private field

    // Constructor to initialize price
    public Product(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Private setter for price, only accessible within the class
    private void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    // Public method to apply discount to price (controls how price is modified)
    public void applyDiscount(double discount) {
        if (discount > 0 && discount <= 100) {
            double newPrice = price - (price * (discount / 100));
            setPrice(newPrice);  // Modifies price via private setter
        } else {
            System.out.println("Invalid discount");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Product object with a valid price
        Product product = new Product(100.0);
        System.out.println("Initial Price: $" + product.getPrice());

        // Applying a discount
        product.applyDiscount(10);
        System.out.println("Price after 10% discount: $" + product.getPrice());

        // Trying to set the price directly (error, since the setter is private)
        // product.setPrice(120.0);  // Error: The method setPrice(double) from the type Product is not visible
    }
}
