class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }
}

public class q12 {
    public static void main(String[] args) {
        Animal a;
        
        a = new Cat();
        a.sound(); // Runtime dispatch to Cat's sound()
        
        a = new Lion();
        a.sound(); // Runtime dispatch to Lion's sound()
        
        System.out.println("Sougata Kundu,24155737");
    }
}
