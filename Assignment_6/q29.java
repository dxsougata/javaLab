// 29. Combining super + final + runtime polymorphism
class Base {
    public final void finalMethod() {
        System.out.println("Base final method - cannot override");
    }
    
    public void overridableMethod() {
        System.out.println("Base overridable method");
    }
}

class Derived extends Base {
    public void overridableMethod() {
        System.out.println("Derived overridable method");
        super.overridableMethod();  // Calls parent version
    }
}

public class q29 {
    public static void main(String[] args) {
        Base ref = new Derived();
        
        // Final method: no polymorphism, compile-time binding
        ref.finalMethod();
        
        // Non-final method: polymorphism, runtime binding
        ref.overridableMethod();
        
        System.out.println("\nExplanation:");
        System.out.println("finalMethod: Base's final method always called");
        System.out.println("overridableMethod: Derived's version called, then super");
        System.out.println("Sougata Kundu , 24155737");
    }
}
