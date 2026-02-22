class Parent {

    Parent(String msg) {
        System.out.println("Parent Constructor: " + msg);
    }
}

class Child extends Parent {

    Child() {
        super("Called from Child"); 
        System.out.println("Child Constructor");
    }
}

public class q06 {
    public static void main(String[] args) {
  
        Child c = new Child();
        System.out.println("Sougata Kundu,24155737");
        
    }
}