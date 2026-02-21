// parent class
class product {

    String ProductName;//instance variable
    double price;//instance variable

    // Static block (runs once when class is loaded)
    static {
        System.out.println("Product class loaded");
    }

    // Instance block (runs every time object is created)
    {
        System.out.println("Product object created");
    }

    // Constructor
    product(String ProductName, double price) {
        this.ProductName = ProductName;
        this.price = price;
    }

    // Method to apply discount (no discount)
    double calculateDiscount() {
        return price;
    }
}


// Child class
class Electronics extends product {

    int warrantyYears;

    // Constructor
    Electronics(String ProductName, double price, int warrantyYears) {
        super(ProductName, price); // Constructor chaining using super keyword
        this.warrantyYears = warrantyYears;//extra variable of child class
    }

    // Overriding method to apply discount for electronics
    @Override
    double calculateDiscount() {
        return price * 0.9; // 10% discount
    }
}


// Main class
public class shopping {

    public static void main(String[] args) {

        // Runtime Polymorphism
        product p = new Electronics("Laptop", 65000, 2026);

        System.out.println("Product Name: " + p.ProductName + " Final Price: " + p.calculateDiscount());
    }
}