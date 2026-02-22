// 20. Static methods are not polymorphic
class Base {
    public static void test() {
        System.out.println("Base static method");
    }
}

class Derived extends Base {
    public static void test() {
        System.out.println("Derived static method");
    }
}

public class q20 {
    public static void main(String[] args) {
        Base ref = new Derived();
        ref.test();  // Calls Base's static method
        
        Derived derived = new Derived();
        derived.test();  // Calls Derived's static method
        System.out.println("Sougata Kundu , 24155737");
    }
}
