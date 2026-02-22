class Parent {
    Parent(int a, int b) {
        System.out.println("Parent: " + a + " + " + b + " = " + (a + b));
    }
}

class Child extends Parent {
    Child(int x, int y) {
        super(x, y);
        System.out.println("Child constructor");
    }
}

public class q18 {
    public static void main(String[] args) {
        Child c = new Child(10, 20);
        System.out.println("Sougata Kundu,24155737");
    }
}
