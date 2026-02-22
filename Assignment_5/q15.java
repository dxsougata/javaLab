class Parent {
    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    void show() {
        super.show(); // Call parent's show()
        System.out.println("Child show method");
    }
}

public class q15 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        System.out.println("Sougata Kundu,24155737");
    }
}
