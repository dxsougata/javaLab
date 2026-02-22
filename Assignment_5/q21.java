class Parent {
    int value = 10;
    
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method");
        // System.out.println(super.value); // Error: cannot use super in static context
        // super.display(); // Error: cannot use super in static context
    }
    
    void instanceMethod() {
        System.out.println("Instance method can use super: " + super.value);
    }
}

public class q21 {
    public static void main(String[] args) {
        Child.staticMethod();
        Child c = new Child();
        c.instanceMethod();
        System.out.println("Sougata Kundu,24155737");
    }
}
