// Question 9: Constructor calling another constructor to avoid code duplication
public class q09 {
    private String productName;
    private double price;
    private int quantity;
    private String category;
    
    // Master constructor: Contains all initialization logic
    public q09(String productName, double price, int quantity, String category) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        System.out.println("Master constructor called - All fields initialized");
    }
    
    // Constructor with 3 parameters - calls master constructor with default category
    public q09(String productName, double price, int quantity) {
        this(productName, price, quantity, "General");  // Avoids duplicating initialization code
        System.out.println("3-parameter constructor called");
    }
    
    // Constructor with 2 parameters - calls master constructor with default quantity and category
    public q09(String productName, double price) {
        this(productName, price, 1, "General");  // Avoids duplicating initialization code
        System.out.println("2-parameter constructor called");
    }
    
    // Constructor with 1 parameter - calls master constructor with all defaults
    public q09(String productName) {
        this(productName, 0.0, 1, "General");  // Avoids duplicating initialization code
        System.out.println("1-parameter constructor called");
    }
    
    // Display product details
    public void displayProduct() {
        System.out.println("\n  Product Details:");
        System.out.println("  Name: " + productName);
        System.out.println("  Price: $" + price);
        System.out.println("  Quantity: " + quantity);
        System.out.println("  Category: " + category);
        System.out.println("  Total Value: $" + (price * quantity));
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Chaining to Avoid Code Duplication:\n");
        
        System.out.println("Creating product1 with all parameters:");
        q09 product1 = new q09("Laptop", 1200.0, 5, "Electronics");
        product1.displayProduct();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating product2 with 3 parameters (default category):");
        q09 product2 = new q09("Mouse", 25.0, 10);
        product2.displayProduct();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating product3 with 2 parameters (default quantity and category):");
        q09 product3 = new q09("Keyboard", 75.0);
        product3.displayProduct();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating product4 with 1 parameter (all defaults):");
        q09 product4 = new q09("Monitor");
        product4.displayProduct();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("\nNote: All constructors call the master constructor,");
        System.out.println("avoiding code duplication of initialization logic.");
        System.out.println("Sougata Kundu , 24155737");
    }
}
