// 25. Method call resolution when overridden methods throw exceptions
class Parent {
    public void test() throws Exception {
        System.out.println("Parent test throws Exception");
    }
}

class Child extends Parent {
    public void test() throws RuntimeException {
        System.out.println("Child test throws RuntimeException");
    }
}

public class q25 {
    public static void main(String[] args) {
        try {
            Parent ref = new Child();
            ref.test();  // Calls Child's test()
        } catch (Exception e) {
            System.out.println("Caught exception");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
