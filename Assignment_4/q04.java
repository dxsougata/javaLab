// Question 4: Constructor that prints a message when an object is created
public class q04 {
    private String objectName;
    private static int objectCount = 0;
    
    // Default Constructor - prints message when object is created
    public q04() {
        objectCount++;
        this.objectName = "Object" + objectCount;
        System.out.println(" Constructor called! A new object '" + objectName + "' has been created.");
        System.out.println("  Total objects created so far: " + objectCount);
    }
    
    // Parameterized Constructor - prints message with custom name
    public q04(String name) {
        objectCount++;
        this.objectName = name;
        System.out.println(" Parameterized Constructor called! Object '" + objectName + "' has been created.");
        System.out.println("  Total objects created so far: " + objectCount);
    }
    
    // Method to display object details
    public void displayInfo() {
        System.out.println("  Object Name: " + objectName);
    }
    
    public static void main(String[] args) {
        
        System.out.println("=== Constructor Message Demonstration ===\n");
        
        System.out.println("Creating first object using default constructor:");
        q04 obj1 = new q04();
        System.out.println();
        
        System.out.println("Creating second object using default constructor:");
        q04 obj2 = new q04();
        System.out.println();
        
        System.out.println("Creating third object using parameterized constructor:");
        q04 obj3 = new q04("StudentObject");
        System.out.println();
        
        System.out.println("Creating fourth object with custom name:");
        q04 obj4 = new q04("DatabaseConnection");
        System.out.println();
        
        System.out.println("Creating fifth object with custom name:");
        q04 obj5 = new q04("FileHandler");
        System.out.println();
        
        System.out.println("--- Summary ---");
        System.out.println("All objects created successfully!");
        System.out.println("Total objects created: " + objectCount);
        System.out.println("Sougata Kundu , 24155737");
    }
}
