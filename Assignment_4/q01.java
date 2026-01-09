// Question 1: Default Constructor - Initializes data members with default values
public class q01 {
    private String name;
    private int age;
    private double gpa;
    private String rollNumber;
    
    // Constructor
    public q01() {
        this.name = "Unknown";
        this.age = 0;
        this.gpa = 0.0;
        this.rollNumber = "N/A";
    }
    
    // Display 
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Roll Number: " + rollNumber);
    }
    
    public static void main(String[] args) {
        
        System.out.println("--- Default Constructor Demonstration ---");
        q01 student = new q01();
        student.age = 19;
        student.display();
        System.out.println("Sougata Kundu , 24155737");
    }
}
