class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

// Aggregation: Car HAS-A Engine
class Car {
    Engine engine;
    
    Car(Engine engine) {
        this.engine = engine;
    }
    
    void start() {
        engine.start();
    }
}

// Inheritance: SportsCar IS-A Vehicle
class Vehicle {
    void run() {
        System.out.println("Vehicle runs");
    }
}

class SportsCar extends Vehicle {
    void turbo() {
        System.out.println("Turbo activated");
    }
}

public class q38 {
    public static void main(String[] args) {
        System.out.println("Aggregation (HAS-A):");
        Engine e = new Engine();
        Car c = new Car(e);
        c.start();
        
        System.out.println("\nInheritance (IS-A):");
        SportsCar sc = new SportsCar();
        sc.run();
        sc.turbo();
        
        System.out.println("Sougata Kundu,24155737");
    }
}
