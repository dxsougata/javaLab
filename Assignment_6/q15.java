// 15. Runtime polymorphism using method overriding
class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class q15 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animal = new Animal();
        
        dog.sound();
        cat.sound();
        animal.sound();
        System.out.println("Sougata Kundu , 24155737");
    }
}
