class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show - without super");
    }
    
    void showBoth() {
        super.show(); // With super
        this.show(); // Without super (calls overridden method)
    }
}

public class q22 {
    public static void main(String[] args) {
        Child c = new Child();
        c.showBoth();
        System.out.println("Sougata Kundu,24155737");
    }
}
