class Demo {
    int value = 10;
    
    static void staticMethod() {
        System.out.println("Static method");
        // System.out.println(this.value); // Error: cannot use this in static context
        // System.out.println(this); // Error: cannot use this in static context
    }
    
    void instanceMethod() {
        System.out.println("Instance method can use this: " + this.value);
    }
}

public class q27 {
    public static void main(String[] args) {
        Demo.staticMethod();
        Demo d = new Demo();
        d.instanceMethod();
        System.out.println("Sougata Kundu,24155737");
    }
}
