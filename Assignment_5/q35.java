class Engine {
    String type;
    
    Engine(String type) {
        this.type = type;
    }
    
    void start() {
        System.out.println(type + " engine started");
    }
}

class Car {
    String model;
    Engine engine; // Car contains Engine object
    
    Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    
    void startCar() {
        System.out.println("Starting " + model);
        engine.start();
    }
}

public class q35 {
    public static void main(String[] args) {
        Engine e = new Engine("V8");
        Car c = new Car("Mustang", e);
        c.startCar();
        System.out.println("Sougata Kundu,24155737");
    }
}
