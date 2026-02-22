// 22. Runtime binding of overridden methods
class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats meat");
    }
}

class Cow extends Animal {
    public void eat() {
        System.out.println("Cow eats grass");
    }
}

public class q22 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cow();
        Animal a3 = new Animal();
        
        a1.eat();  // Runtime decides: calls Dog's eat()
        a2.eat();  // Runtime decides: calls Cow's eat()
        a3.eat();  // Runtime decides: calls Animal's eat()
        System.out.println("Sougata Kundu , 24155737");
    }
}
