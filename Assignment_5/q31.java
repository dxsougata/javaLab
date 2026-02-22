class Demo {
    int value;
    
    Demo(int value) {
        this.value = value;
    }
    
    void displayReference() {
        System.out.println("Memory reference: " + this);
        System.out.println("Value: " + this.value);
    }
}

public class q31 {
    public static void main(String[] args) {
        Demo d1 = new Demo(100);
        Demo d2 = new Demo(200);
        System.out.println("d1 reference: " + d1);
        d1.displayReference();
        System.out.println("d2 reference: " + d2);
        d2.displayReference();
        System.out.println("Sougata Kundu,24155737");
    }
}
