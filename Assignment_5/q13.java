class Parent {
    Parent(String msg) {
        System.out.println("Parent: " + msg);
    }
}

class Child extends Parent {
    Child() {
        super("Constructor called");
        System.out.println("Child constructor");
    }
}

public class q13 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Sougata Kundu,24155737");
    }
}
