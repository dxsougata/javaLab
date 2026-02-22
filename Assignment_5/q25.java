class Test {
    void display(Test obj) {
        System.out.println("Object received: " + obj);
    }
    
    void callDisplay() {
        display(this); // Passing current object as parameter
    }
}

public class q25 {
    public static void main(String[] args) {
        Test t = new Test();
        t.callDisplay();
        System.out.println("Sougata Kundu,24155737");
    }
}
