// Simple parent-child constructor call demonstration
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Q16 extends Parent {
    Q16() {
        // super() is called implicitly, then this message prints
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        

        new Q16();
        System.out.println("Sougata Kundu , 24155737");
    }
}
