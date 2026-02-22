class Parent {
    int num = 50;
}

class Child extends Parent {
    int num = 100;
    
    void display(int num) {
        System.out.println("Local num: " + num);
        System.out.println("Child num: " + this.num);
        System.out.println("Parent num: " + super.num);
    }
}

public class q17 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(200);
        System.out.println("Sougata Kundu,24155737");
    }
}
