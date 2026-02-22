class Employee {
    String name;
    int id;
    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class Department {
    String deptName;
    Employee[] employees;
    
    Department(String deptName, Employee[] employees) {
        this.deptName = deptName;
        this.employees = employees;
    }
    
    void displayDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

public class q37 {
    public static void main(String[] args) {
        Employee[] emps = {
            new Employee("John", 1),
            new Employee("Sarah", 2),
            new Employee("Mike", 3)
        };
        Department dept = new Department("IT", emps);
        dept.displayDept();
        System.out.println("Sougata Kundu,24155737");
    }
}
