// Question 14: Duplicate object data using a constructor instead of clone() method
class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    
    // Parameterized constructor
    public Car(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        System.out.println("  → Original constructor called");
    }
    
    // Copy constructor - duplicates object data without using clone()
    public Car(Car original) {
        this.brand = original.brand;
        this.model = original.model;
        this.year = original.year;
        this.price = original.price;
        this.color = original.color;
        System.out.println("  → Copy constructor called - Object duplicated");
    }
    
    // Method to modify car details
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    // Display car details
    public void display() {
        System.out.println("  Brand: " + brand);
        System.out.println("  Model: " + model);
        System.out.println("  Year: " + year);
        System.out.println("  Price: $" + price);
        System.out.println("  Color: " + color);
    }
    
    // Method to get object hashcode for comparison
    public void showObjectInfo() {
        System.out.println("  Object Reference: " + this.hashCode());
    }
}

public class q14 {
    public static void main(String[] args) {
        System.out.println("Duplicating Object Data Using Constructor (Not clone())\n");
        System.out.println("=".repeat(60));
        
        // Create original car object
        System.out.println("\nCreating original car object:");
        Car originalCar = new Car("Toyota", "Camry", 2023, 35000.0, "Silver");
        
        System.out.println("\nOriginal Car Details:");
        originalCar.display();
        originalCar.showObjectInfo();
        
        System.out.println("\n" + "=".repeat(60));
        
        // Duplicate car object using copy constructor (not clone())
        System.out.println("\nDuplicating car object using copy constructor:");
        Car duplicatedCar = new Car(originalCar);
        
        System.out.println("\nDuplicated Car Details:");
        duplicatedCar.display();
        duplicatedCar.showObjectInfo();
        
        System.out.println("\n" + "=".repeat(60));
        
        // Verify they are independent objects
        System.out.println("\nVerifying objects are independent:");
        System.out.println("Original hashcode: " + originalCar.hashCode());
        System.out.println("Duplicate hashcode: " + duplicatedCar.hashCode());
        System.out.println("Are they same object? " + (originalCar == duplicatedCar));
        
        System.out.println("\n" + "=".repeat(60));
        
        // Modify the duplicated car
        System.out.println("\nModifying duplicated car (price, color, year):");
        duplicatedCar.setPrice(32000.0);
        duplicatedCar.setColor("Red");
        duplicatedCar.setYear(2022);
        
        System.out.println("\nAfter Modification:");
        System.out.println("\nOriginal Car (unchanged):");
        originalCar.display();
        
        System.out.println("\nDuplicated Car (modified):");
        duplicatedCar.display();
        
        System.out.println("\n" + "=".repeat(60));
        
        // Create another duplicate
        System.out.println("\nCreating another duplicate from the modified car:");
        Car anotherCopy = new Car(duplicatedCar);
        
        System.out.println("\nAnother Copy Details:");
        anotherCopy.display();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("\nAdvantages of Copy Constructor over clone():");
        System.out.println("=".repeat(60));
        System.out.println("1. No need to implement Cloneable interface");
        System.out.println("2. No need to handle CloneNotSupportedException");
        System.out.println("3. Type-safe - returns exact type, not Object");
        System.out.println("4. More readable and maintainable code");
        System.out.println("5. Easier to implement deep copy if needed");
        System.out.println("6. Better control over copying logic");
        System.out.println("7. Can be used in constructor chaining");
        System.out.println("\nAll three car objects are independent copies!");
        System.out.println("Sougata Kundu , 24155737");
    }
}
