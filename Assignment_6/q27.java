// 27. Upcasting and its role in polymorphism
class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion roars");
    }
    
    public void hunt() {
        System.out.println("Lion hunts");
    }
}

public class q27 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        
        // Upcasting (implicit)
        Animal animal = lion;
        
        animal.sound();    // Polymorphic call
        // animal.hunt();  // Cannot call Lion-specific method
        
        System.out.println("Upcasting allows using child as parent type");
        System.out.println("Sougata Kundu , 24155737");
    }
}
