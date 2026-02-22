public class q10 {
    static int staticVariable = 0;
    int instanceVariable;
    
    static {
        staticVariable = 100;
        System.out.println("1. Static initializer block executed!");
    }
    
    {
        System.out.println("2. First instance initializer block executed!");
        instanceVariable = 20;
    }
    
    // Second instance initializer block
    {
        System.out.println("3. Second instance initializer block executed!");
        instanceVariable += 30;
    }
    
    // Constructor
    public q10() {
        System.out.println("4. Constructor executed!");
        instanceVariable += 50;
    }
    
    public void display() {
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Creating first object ===");
        q10 obj1 = new q10();
        obj1.display();
        
        System.out.println("\n=== Creating second object ===");
        q10 obj2 = new q10();
        obj2.display();
        System.out.println("Sougata Kundu , 24155737");
    }
}
