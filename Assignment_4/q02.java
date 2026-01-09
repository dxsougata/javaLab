// Question 2: Parameterized Constructor - Initialize and display student details
public class q02 {
    private String name;
    private int age;
    private String rollNumber;
    private double gpa;
    private String branch;
    
    // Parameterized Constructor
    public q02(String name, int age, String rollNumber, double gpa, String branch) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.gpa = gpa;
        this.branch = branch;
    }
    
    // Display method
    public void display() {
        System.out.println("\n    Student Information   \n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("GPA: " + gpa);
        System.out.println("Branch: " + branch);
        System.out.println("===========================");
    }
    
    public static void main(String[] args) {
        
        System.out.println("--- Parameterized Constructor Demonstration ---");
        
        // Creating student objects using parameterized constructor
        q02 student1 = new q02("Sougata Kundu", 20, "24155737", 8.5, "Computer Science");
        q02 student2 = new q02("Rajib Das", 21, "24155738", 8.2, "Information Technology");
        q02 student3 = new q02("Priya Singh", 19, "24155739", 8.8, "Electronics");
        
        student1.display();
        student2.display();
        student3.display();
        System.out.println("Sougata Kundu , 24155737");
    }
}
