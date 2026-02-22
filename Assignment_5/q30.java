class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name; // this in constructor
        this.age = age;
        System.out.println("Constructor: this = " + this);
    }
    
    void setName(String name) {
        this.name = name; // this in method
        System.out.println("Method: this = " + this);
    }
    
    void display() {
        System.out.println("Name: " + this.name); // this in method
        System.out.println("Age: " + this.age);
    }
}

public class q30 {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        System.out.println("Object: " + p);
        p.setName("Bob");
        p.display();
        System.out.println("Sougata Kundu,24155737");
    }
}
