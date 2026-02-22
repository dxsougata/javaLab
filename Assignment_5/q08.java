class Parent {
    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display method");
    }
}

public class q08 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        
        Child c = new Child();
        c.display();
        
        Parent pc = new Child(); // Parent reference, Child object
        pc.display();
        
        System.out.println("Sougata Kundu,24155737");
    }
}
