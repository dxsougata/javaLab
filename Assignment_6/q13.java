// 13. Instance initializer block execution in inheritance
class Parent {
    {
        System.out.println("Parent initializer block");
    }
    
    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    {
        System.out.println("Child initializer block");
    }
    
    public Child() {
        System.out.println("Child constructor");
    }
}

public class q13 {
    public static void main(String[] args) {
        System.out.println("Creating Child object:");
        Child obj = new Child();
        System.out.println("Sougata Kundu , 24155737");
    }
}
