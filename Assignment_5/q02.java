// 2. Write a program to demonstrate single inheritance with method overriding.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class q02 {
    public static void main(String[] args) {
        Dog d = new Dog();
        // Overridden method is called
        d.sound();
        System.out.println("Name   : Sougata Kundu");
        System.out.println("RollNo : 24155737\n");
    }
}
