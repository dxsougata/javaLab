// 17. Runtime polymorphism does not apply to instance variables
class Vehicle {
    int speed = 50;
}

class Car extends Vehicle {
    int speed = 100;  // Shadows parent variable
}

public class q17 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        
        System.out.println("speed via Vehicle reference: " + car.speed);
        
        Car carRef = new Car();
        System.out.println("speed via Car reference: " + carRef.speed);
        System.out.println("Sougata Kundu , 24155737");
    }
}
