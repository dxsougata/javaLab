class Sample {
    int value;
    
    void setValue(int value) {
        this.value = value; // this is implicitly passed
        System.out.println("this object: " + this);
    }
    
    void display() {
        System.out.println("Value: " + this.value); // this is implicitly passed
        System.out.println("this object: " + this);
    }
}

public class q29 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println("s1 object: " + s1);
        s1.setValue(100);
        s1.display();
        System.out.println("Sougata Kundu,24155737");
    }
}
