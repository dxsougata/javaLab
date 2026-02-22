class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Must be first statement
        System.out.println("Child constructor");
        // super(); // This would cause error - not first statement
    }
}

public class q19 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Sougata Kundu,24155737");
    }
}
