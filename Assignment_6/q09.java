public class q09 {
    final int finalVariable;
    
   
    {
        finalVariable = 10;
        System.out.println("Instance initializer block executed!");
    }
    
    // Constructor
    public q09() {
        System.out.println("Constructor executed!");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating object...");
        q09 obj = new q09();
        System.out.println("Final variable value: " + obj.finalVariable);
        
        // obj.finalVariable = 20;  // Cannot assign a value to final variable
        System.out.println("Sougata Kundu , 24155737");
    }
}
