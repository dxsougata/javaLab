// 19. Constructors do not support runtime polymorphism
class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child constructor");
    }
}

public class q19 {
    public static void main(String[] args) {
        Parent ref = new Child();
        // Both parent and child constructors are called
        // Constructor binding is done at compile time, not runtime
        System.out.println("Sougata Kundu , 24155737");
    }
}
