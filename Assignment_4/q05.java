// Question 5: Demonstrating Constructor Overloading with different parameter lists
public class q05 {
    private String name;
    private int rollNumber;
    private String branch;
    private double gpa;
    private int semester;
    
    public q05() {
        this.name = "Not Specified";
        this.rollNumber = 0;
        this.branch = "General";
        this.gpa = 0.0;
        this.semester = 1;
        System.out.println("→ Default Constructor called (No parameters)");
    }
    
    public q05(String name) {
        this.name = name;
        this.rollNumber = 0;
        this.branch = "General";
        this.gpa = 0.0;
        this.semester = 1;
        System.out.println("→ Constructor called (1 parameter: name)");
    }
    
    public q05(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = "General";
        this.gpa = 0.0;
        this.semester = 1;
        System.out.println("→ Constructor called (2 parameters: name, rollNumber)");
    }
    
    public q05(String name, int rollNumber, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.gpa = 0.0;
        this.semester = 1;
        System.out.println("→ Constructor called (3 parameters: name, rollNumber, branch)");
    }
    
    public q05(String name, int rollNumber, String branch, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.gpa = gpa;
        this.semester = 1;
        System.out.println("→ Constructor called (4 parameters: name, rollNumber, branch, gpa)");
    }
    
    public q05(String name, int rollNumber, String branch, double gpa, int semester) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.gpa = gpa;
        this.semester = semester;
        System.out.println("→ Constructor called (5 parameters: all fields)");
    }
    
    // Display method
    public void display() {
        System.out.println("  Name: " + name);
        System.out.println("  Roll Number: " + rollNumber);
        System.out.println("  Branch: " + branch);
        System.out.println("  GPA: " + gpa);
        System.out.println("  Semester: " + semester);
    }
    
    public static void main(String[] args) {
        // Sougata Kundu , 24155737
        System.out.println("=== Constructor Overloading Demonstration ===\n");
        
        System.out.println("Creating student1 with no parameters:");
        q05 student1 = new q05();
        student1.display();
        System.out.println();
        
        System.out.println("Creating student2 with 1 parameter:");
        q05 student2 = new q05("Sougata Kundu");
        student2.display();
        System.out.println();
        
        System.out.println("Creating student3 with 2 parameters:");
        q05 student3 = new q05("Rajib Das", 24155738);
        student3.display();
        System.out.println();
        
        System.out.println("Creating student4 with 3 parameters:");
        q05 student4 = new q05("Priya Singh", 24155739, "Computer Science");
        student4.display();
        System.out.println();
        
        System.out.println("Creating student5 with 4 parameters:");
        q05 student5 = new q05("Amit Kumar", 24155740, "Information Technology", 8.5);
        student5.display();
        System.out.println();
        
        System.out.println("Creating student6 with 5 parameters:");
        q05 student6 = new q05("Sneha Sharma", 24155741, "Electronics", 8.8, 4);
        student6.display();
        System.out.println();
        
        System.out.println("--- Summary ---");
        System.out.println("Constructor Overloading allows multiple constructors with different parameter lists.");
        System.out.println("Total constructors defined: 6");
        System.out.println("All constructors executed successfully!");
        System.out.println("Sougata Kundu , 24155737");
    }
}
