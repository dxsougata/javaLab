// Question 3: Demonstrating the difference between Constructor and Method
public class q03 {
    private String name;
    private int count;
    
    // Constructor - No return type, same name as class
    // Called automatically when object is created
    public q03() {
        this.name = "Default";
        this.count = 0;
        System.out.println("Constructor called: Object created with default values");
    }
    
    // Parameterized Constructor
    public q03(String name) {
        this.name = name;
        this.count = 0;
        System.out.println("Parameterized Constructor called: Object created with name = " + name);
    }
    
    // Method - Has return type (void), different name
    // Must be called explicitly
    public void setName(String name) {
        this.name = name;
        System.out.println("Method setName() called: Name changed to " + name);
    }
    
    // Method with return type
    public String getName() {
        System.out.println("Method getName() called");
        return this.name;
    }
    
    // Method to increment count
    public void incrementCount() {
        this.count++;
        System.out.println("Method incrementCount() called: Count is now " + count);
    }
    
    // Method with return type int
    public int getCount() {
        return this.count;
    }
    
    public static void main(String[] args) {
        // Sougata Kundu , 24155737
        System.out.println("=== Difference between Constructor and Method ===\n");
        
        System.out.println("--- Key Differences ---");
        System.out.println("CONSTRUCTOR:");
        System.out.println("1. Same name as class");
        System.out.println("2. No return type (not even void)");
        System.out.println("3. Called automatically when object is created");
        System.out.println("4. Used to initialize object state");
        System.out.println("5. Can be overloaded\n");
        
        System.out.println("METHOD:");
        System.out.println("1. Can have any valid name");
        System.out.println("2. Must have a return type (void, int, String, etc.)");
        System.out.println("3. Must be called explicitly");
        System.out.println("4. Used to perform operations on object");
        System.out.println("5. Can be overloaded and overridden\n");
        
        System.out.println("--- Practical Demonstration ---\n");
        
        // Constructor is called automatically
        System.out.println("Creating object1 using default constructor:");
        q03 object1 = new q03();
        System.out.println();
        
        // Constructor is called automatically with parameter
        System.out.println("Creating object2 using parameterized constructor:");
        q03 object2 = new q03("Sougata");
        System.out.println();
        
        // Methods must be called explicitly
        System.out.println("Calling methods on object1:");
        object1.setName("Kundu");
        String retrievedName = object1.getName();
        System.out.println("Retrieved name: " + retrievedName);
        object1.incrementCount();
        object1.incrementCount();
        System.out.println("Final count: " + object1.getCount());
        System.out.println();
        
        System.out.println("Calling methods on object2:");
        object2.incrementCount();
        System.out.println("Name from object2: " + object2.getName());
        System.out.println("Count from object2: " + object2.getCount());
    }
}
