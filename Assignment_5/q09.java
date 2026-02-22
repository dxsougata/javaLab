class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding");
    }
}

public class q09 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
        
        Bike b = new Bike();
        b.start();
        b.ride();
        
        System.out.println("Sougata Kundu,24155737");
    }
}
