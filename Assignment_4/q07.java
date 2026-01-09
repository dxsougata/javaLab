// Question 7: Multiple constructors initializing an object in different ways
public class q07 {
    private String productName;
    private double price;
    private int quantity;
    private String category;
    private String manufacturer;
    
    // Constructor 1: Initialize with product name only
    public q07(String productName) {
        this.productName = productName;
        this.price = 0.0;
        this.quantity = 0;
        this.category = "Uncategorized";
        this.manufacturer = "Unknown";
        System.out.println("→ Initialized with product name only");
    }
    
    // Constructor 2: Initialize with name and price
    public q07(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 1;
        this.category = "General";
        this.manufacturer = "Unknown";
        System.out.println("→ Initialized with product name and price");
    }
    
    // Constructor 3: Initialize with name, price, and quantity
    public q07(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = "General";
        this.manufacturer = "Unknown";
        System.out.println("→ Initialized with product name, price, and quantity");
    }
    
    // Constructor 4: Initialize with name, price, quantity, and category
    public q07(String productName, double price, int quantity, String category) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = "Unknown";
        System.out.println("→ Initialized with product name, price, quantity, and category");
    }
    
    // Constructor 5: Initialize with all parameters
    public q07(String productName, double price, int quantity, String category, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = manufacturer;
        System.out.println("→ Initialized with all parameters");
    }
    
    // Display product details
    public void display() {
        System.out.println("  Product: " + productName);
        System.out.println("  Price: " + price);
        System.out.println("  Quantity: " + quantity);
        System.out.println("  Category: " + category);
        System.out.println("  Manufacturer: " + manufacturer);
        System.out.println("  Total Value: " + (price * quantity));
    }
    
    public static void main(String[] args) {
        // Sougata Kundu , 24155737
        System.out.println("=== Multiple Ways to Initialize Objects ===\n");
        
        System.out.println("Product 1: Initialized with name only");
        q07 product1 = new q07("Laptop");
        product1.display();
        System.out.println();
        
        System.out.println("Product 2: Initialized with name and price");
        q07 product2 = new q07("Mouse", 25.99);
        product2.display();
        System.out.println();
        
        System.out.println("Product 3: Initialized with name, price, and quantity");
        q07 product3 = new q07("Keyboard", 45.50, 10);
        product3.display();
        System.out.println();
        
        System.out.println("Product 4: Initialized with name, price, quantity, and category");
        q07 product4 = new q07("Monitor", 299.99, 5, "Electronics");
        product4.display();
        System.out.println();
        
        System.out.println("Product 5: Initialized with all parameters");
        q07 product5 = new q07("Headphones", 89.99, 15, "Audio", "Sony");
        product5.display();
        System.out.println();
        
        System.out.println("--- Summary ---");
        System.out.println("Demonstrated 5 different ways to initialize objects using overloaded constructors.");
        System.out.println("Sougata Kundu , 24155737");
    }
}
