class Parent {
    public final void greet() {
        System.out.println("Hello from final method");
    }
}

class Child extends Parent {
    
       public void greet1() {
         System.out.println("Trying to override final method");
     }
}

public class q03 {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        System.out.println("Sougata Kundu , 24155737");
    }
}
