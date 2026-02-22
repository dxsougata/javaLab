class Base {
    public final void display() {
        System.out.println("Final method in Base class");
    }
}

class Derived extends Base {
    
    @Override
    public void display() {
        System.out.println("Trying to override final method");
    }
    
}

public class q08 {
    public static void main(String[] args) {
        
        
        Derived d = new Derived();
        d.display(); 
        
        System.out.println("\nTo see the error, uncomment the overridden method in Derived class");
        System.out.println("Sougata Kundu , 24155737");
    }
}
