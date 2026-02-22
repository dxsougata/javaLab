public class q11 {
    // Instance variable
    private int value;
    private String message;
    
    // Instance initializer block - executes BEFORE constructor
    {
        System.out.println("Step 1: Instance initializer block starts");
        value = 100;
        message = "Initialized in instance block";
        System.out.println("Step 2: Instance initializer block ends");
        System.out.println("        value = " + value + ", message = \"" + message + "\"");
    }
    
    // Constructor - executes AFTER instance initializer block
    public q11() {
        System.out.println("Step 3: Constructor starts");
        value += 50;
        message += " + modified in constructor";
        System.out.println("Step 4: Constructor ends");
        System.out.println("        value = " + value + ", message = \"" + message + "\"");
    }
    
    // Overloaded constructor
    public q11(String msg) {
        System.out.println("Step 3: Overloaded Constructor starts");
        value += 200;
        message = msg;
        System.out.println("Step 4: Overloaded Constructor ends");
        System.out.println("        value = " + value + ", message = \"" + message + "\"");
    }
    
    public void display() {
        System.out.println("\nFinal values: value = " + value + ", message = \"" + message + "\"");
    }
    
    public static void main(String[] args) {
        System.out.println(" Creating object with default constructor ");
        q11 obj1 = new q11();
        obj1.display();
        
        System.out.println("\n Creating object with overloaded constructor ");
        q11 obj2 = new q11("Custom message");
        obj2.display();
        System.out.println("Sougata Kundu , 24155737");
    }
}
