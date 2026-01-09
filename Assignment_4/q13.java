// Question 13: Implement a copy constructor and explain its use
class Book {
    private String title;
    private String author;
    private double price;
    private int pages;
    
    // Parameterized constructor to initialize a book
    public Book(String title, String author, double price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        System.out.println("  → Parameterized constructor called");
    }
    
    // Copy constructor - creates a new object by copying another object
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.pages = other.pages;
        System.out.println("  → Copy constructor called");
    }
    
    // Method to modify book details
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    // Display book details
    public void display() {
        System.out.println("  Title: " + title);
        System.out.println("  Author: " + author);
        System.out.println("  Price: $" + price);
        System.out.println("  Pages: " + pages);
    }
}

public class q13 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Copy Constructor\n");
        System.out.println("=".repeat(50));
        
        // Create original book object
        System.out.println("\nCreating original book:");
        Book originalBook = new Book("Java Programming", "John Doe", 49.99, 500);
        
        System.out.println("\nOriginal Book Details:");
        originalBook.display();
        
        System.out.println("\n" + "=".repeat(50));
        
        // Create a copy of the book using copy constructor
        System.out.println("\nCreating a copy of the book:");
        Book copiedBook = new Book(originalBook);
        
        System.out.println("\nCopied Book Details:");
        copiedBook.display();
        
        System.out.println("\n" + "=".repeat(50));
        
        // Modify the copied book
        System.out.println("\nModifying the copied book (changing price and title):");
        copiedBook.setPrice(39.99);
        copiedBook.setTitle("Java Programming - Student Edition");
        
        System.out.println("\nAfter Modification:");
        System.out.println("\nOriginal Book Details:");
        originalBook.display();
        
        System.out.println("\nCopied Book Details:");
        copiedBook.display();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("\nExplanation of Copy Constructor:");
        System.out.println("=".repeat(50));
        System.out.println("1. A copy constructor creates a new object by copying");
        System.out.println("   the values from an existing object of the same class.");
        System.out.println("\n2. It takes an object of the same class as a parameter.");
        System.out.println("\n3. It creates an independent copy - modifying the copy");
        System.out.println("   does NOT affect the original object.");
        System.out.println("\n4. Uses:");
        System.out.println("   - Create duplicate objects with same initial values");
        System.out.println("   - Avoid shared references between objects");
        System.out.println("   - Implement deep copy for objects containing references");
        System.out.println("   - Pass objects to methods without affecting originals");
        System.out.println("\n5. In the example above:");
        System.out.println("   - We created an original book object");
        System.out.println("   - Used copy constructor to create a duplicate");
        System.out.println("   - Modified the copy (price and title changed)");
        System.out.println("   - Original remained unchanged - proving independence");
        System.out.println("Sougata Kundu , 24155737");
    }
}
