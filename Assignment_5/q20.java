class GrandParent {
    GrandParent() {
        System.out.println("GrandParent constructor");
    }
}

class Parent extends GrandParent {
    Parent() {
        super();
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }
}

public class q20 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Sougata Kundu,24155737");
    }
}
