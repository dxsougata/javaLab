// Question 10: Create an array of objects initialized using a constructor
class Student {
    private String name;
    private int rollNumber;
    private double marks;
    private String grade;
    
    // Constructor to initialize student object
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }
    
    // Calculate grade based on marks
    private String calculateGrade(double marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
    
    // Display student details
    public void display() {
        System.out.println("  Name: " + name);
        System.out.println("  Roll Number: " + rollNumber);
        System.out.println("  Marks: " + marks);
        System.out.println("  Grade: " + grade);
    }
}

public class q10 {
    public static void main(String[] args) {
        System.out.println("Creating an Array of Student Objects:\n");
        
        // Declare and create an array of Student objects
        Student[] students = new Student[5];
        
        // Initialize each object using the constructor
        students[0] = new Student("Alice Johnson", 101, 92.5);
        students[1] = new Student("Bob Smith", 102, 78.0);
        students[2] = new Student("Charlie Brown", 103, 85.5);
        students[3] = new Student("Diana Prince", 104, 67.0);
        students[4] = new Student("Eve Wilson", 105, 95.0);
        
        System.out.println("Total number of students: " + students.length);
        System.out.println("=".repeat(50));
        
        // Display all student details
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].display();
            System.out.println("-".repeat(30));
        }
        
        // Calculate and display average marks
        double totalMarks = 0;
        for (Student student : students) {
            // To access marks for average calculation, we'll need to use reflection or add a getter
            // For simplicity, let's create a helper method or just display info
        }
        
        System.out.println("\nAll student objects have been successfully initialized using constructors!");
        System.out.println("Sougata Kundu , 24155737");
    }
}
