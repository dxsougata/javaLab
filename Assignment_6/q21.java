// 21. Effect of final method on runtime polymorphism
class Parent {
    public final void display() {
        System.out.println("Parent final method");
    }
    
    public void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    // Cannot override final method display()
    
    public void show() {
        System.out.println("Child show");
    }
}

public class q21 {
    public static void main(String[] args) {
        Parent ref = new Child();
        ref.display();  // Calls Parent's final method (no polymorphism)
        ref.show();     // Calls Child's show (polymorphic)
        System.out.println("Sougata Kundu , 24155737");
    }
}
