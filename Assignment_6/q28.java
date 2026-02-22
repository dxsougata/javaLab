// 28. Downcasting can cause ClassCastException
class Parent {
    public void display() {
        System.out.println("Parent display");
    }
}

class Child1 extends Parent {
    public void display() {
        System.out.println("Child1 display");
    }
}

class Child2 extends Parent {
    public void display() {
        System.out.println("Child2 display");
    }
}

public class q28 {
    public static void main(String[] args) {
        Parent ref = new Child1();
        ref.display();
        
        // Safe downcast
        Child1 child1 = (Child1) ref;
        child1.display();
        
        // Unsafe downcast - throws ClassCastException
        try {
            Parent ref2 = new Child2();
            Child1 child2 = (Child1) ref2;  // ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught!");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
