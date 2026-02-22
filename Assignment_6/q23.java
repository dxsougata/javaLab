// 23. Parent reference invokes different child implementations
class Vehicle {
    public void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car starting engine");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike starting engine");
    }
}

class Truck extends Vehicle {
    public void start() {
        System.out.println("Truck starting diesel engine");
    }
}

public class q23 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();
        
        v1.start();
        v2.start();
        v3.start();
        System.out.println("Sougata Kundu , 24155737");
    }
}
