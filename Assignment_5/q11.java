class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
    
    void display() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }
}

public class q11 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        System.out.println("Reference x: " + c.x);
        System.out.println("Sougata Kundu,24155737");
    }
}
