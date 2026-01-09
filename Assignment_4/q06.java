// Question 6: Rectangle class with overloaded constructors to calculate area
public class q06 {
    private double length;
    private double width;
    private double area;
    
    // Constructor A: Default dimensions
    public q06() {
        this.length = 10.0;
        this.width = 5.0;
        this.area = calculateArea();
        System.out.println("→ Default Constructor called");
        System.out.println("  Using default dimensions: Length = " + length + ", Width = " + width);
    }
    
    // Constructor B: User-defined dimensions
    public q06(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = calculateArea();
        System.out.println("→ Parameterized Constructor called");
        System.out.println("  Using user-defined dimensions: Length = " + length + ", Width = " + width);
    }
    
    // Method to calculate area
    private double calculateArea() {
        return length * width;
    }
    
    // Display rectangle details
    public void display() {
        System.out.println("  Rectangle Details:");
        System.out.println("  Length: " + length);
        System.out.println("  Width: " + width);
        System.out.println("  Area: " + area);
    }
    
    // Getter for area
    public double getArea() {
        return area;
    }
    
    public static void main(String[] args) {
        // Sougata Kundu , 24155737
        System.out.println("=== Rectangle Area Calculator with Overloaded Constructors ===\n");
        
        System.out.println("Case A: Creating Rectangle with default dimensions:");
        q06 rect1 = new q06();
        rect1.display();
        System.out.println();
        
        System.out.println("Case B: Creating Rectangle with user-defined dimensions:");
        q06 rect2 = new q06(15.5, 8.2);
        rect2.display();
        System.out.println();
        
        System.out.println("Creating more rectangles with different dimensions:");
        q06 rect3 = new q06(20.0, 10.0);
        rect3.display();
        System.out.println();
        
        q06 rect4 = new q06(7.5, 4.5);
        rect4.display();
        System.out.println();
        
        System.out.println("--- Summary ---");
        System.out.println("Rectangle 1 Area (default): " + rect1.getArea());
        System.out.println("Rectangle 2 Area (15.5 x 8.2): " + rect2.getArea());
        System.out.println("Rectangle 3 Area (20.0 x 10.0): " + rect3.getArea());
        System.out.println("Rectangle 4 Area (7.5 x 4.5): " + rect4.getArea());
        System.out.println("Sougata Kundu , 24155737");
    }
}
