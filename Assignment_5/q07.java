class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class q07 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = d; // Upcasting
        a.sound();
        System.out.println("Sougata Kundu,24155737");
    }
}
