class Address {
    String city;
    
    Address(String city) {
        this.city = city;
    }
    
    void display() {
        System.out.println("City: " + city);
    }
}

class Person {
    String name;
    Address address;
    
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class q34 {
    public static void main(String[] args) {
        Address addr = new Address("Delhi");
        Person p = new Person("John", addr);
        
        System.out.println("Person created with address");
        addr.display();
        
        p = null; // Person destroyed
        System.out.println("Person destroyed, but Address still exists:");
        addr.display(); // Address still accessible
        
        System.out.println("Sougata Kundu,24155737");
    }
}
