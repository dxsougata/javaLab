import java.util.*;

class Person {
    String name;
    int age;
    String address;
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Student extends Person {
    String studentId;
    String course;
    double gpa;
    
    public Student(String name, int age, String address, String studentId, String course, double gpa) {
        super(name, age, address);  
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }
    
    public void displayStudentInfo() {
        System.out.println("\n   Student Information   ");
        displayPersonInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
}

public class q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();  
        
        System.out.print("Address: ");
        String address = sc.nextLine();
        
        System.out.print("Student ID: ");
        String studentId = sc.nextLine();
        
        System.out.print("Course: ");
        String course = sc.nextLine();
        
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();
        
  
        Student student = new Student(name, age, address, studentId, course, gpa);
        
      
        student.displayStudentInfo();
        
        sc.close();
    }
}
