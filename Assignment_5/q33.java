class Address {
    String city;
    String state;
    
    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
    
    void display() {
        System.out.println("City: " + city + ", State: " + state);
    }
}

class Employee {
    String name;
    Address address; // Aggregation
    
    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    void display() {
        System.out.println("Name: " + name);
        address.display();
    }
}

public class q33 {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai", "Maharashtra");
        Employee emp = new Employee("Raj", addr);
        emp.display();
        System.out.println("Sougata Kundu,24155737");
    }
}
