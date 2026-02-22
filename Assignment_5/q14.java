class Parent {
    int value = 100;
}

class Child extends Parent {
    int value = 200;
    
    void display() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
    }
}

public class q14 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        System.out.println("Sougata Kundu,24155737");
    }
}
