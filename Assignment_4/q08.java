// Question 8: Demonstrating constructor chaining using this()
public class q08 {
    private String name;
    private int id;
    private String department;
    private double salary;
    private String designation;
    
    // Constructor 1: No parameters - calls Constructor 2
    public q08() {
        this("Employee");
        System.out.println("  → Constructor 1 (no parameters) completed");
    }
    
    // Constructor 2: One parameter - calls Constructor 3
    public q08(String name) {
        this(name, 0);
        System.out.println("  → Constructor 2 (name) completed");
    }
    
    // Constructor 3: Two parameters - calls Constructor 4
    public q08(String name, int id) {
        this(name, id, "General");
        System.out.println("  → Constructor 3 (name, id) completed");
    }
    
    // Constructor 4: Three parameters - calls Constructor 5
    public q08(String name, int id, String department) {
        this(name, id, department, 30000.0);
        System.out.println("  → Constructor 4 (name, id, department) completed");
    }
    
    // Constructor 5: Four parameters - calls Constructor 6
    public q08(String name, int id, String department, double salary) {
        this(name, id, department, salary, "Staff");
        System.out.println("  → Constructor 5 (name, id, department, salary) completed");
    }
    
    // Constructor 6: All parameters - actual initialization happens here
    public q08(String name, int id, String department, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        System.out.println("  → Constructor 6 (all parameters) - Base initialization completed");
    }
    
    // Display employee details
    public void display() {
        System.out.println("\n  Employee Details:");
        System.out.println("  Name: " + name);
        System.out.println("  ID: " + id);
        System.out.println("  Department: " + department);
        System.out.println("  Salary: " + salary);
        System.out.println("  Designation: " + designation);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Chaining using this():\n");
        
        System.out.println("Creating employee1 with no parameters:");
        q08 employee1 = new q08();
        employee1.display();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating employee2 with name only:");
        q08 employee2 = new q08("Alice Johnson");
        employee2.display();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("Creating employee3 with all parameters:");
        q08 employee3 = new q08("Bob Smith", 101, "IT", 75000.0, "Manager");
        employee3.display();
        System.out.println("Sougata Kundu , 24155737");
    }
}
