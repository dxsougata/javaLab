class Employee {
    String name;
    int salary;
    
    Employee setName(String name) {
        this.name = name;
        return this; // Returning current object
    }
    
    Employee setSalary(int salary) {
        this.salary = salary;
        return this; // Returning current object
    }
    
    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class q26 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee returned = e.setName("John").setSalary(50000);
        returned.display();
        System.out.println("Same object: " + (e == returned));
        System.out.println("Sougata Kundu,24155737");
    }
}
