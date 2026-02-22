class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }

  
    public final void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

}

public class q07 {
    public static void main(String[] args) {
        Animal a = new Dog(); 

        
        a.sound();

        a.sleep();
        System.out.println("Sougata Kundu , 24155737");
    }
}
