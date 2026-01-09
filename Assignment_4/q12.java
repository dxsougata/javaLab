// Question 12: Initialize objects using constructors and calculate average marks
import java.util.Scanner;

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
    
    // Getter for marks
    public double getMarks() {
        return marks;
    }
    
    // Display student details
    public void display() {
        System.out.println("  Roll Number: " + rollNumber);
        System.out.println("  Name: " + name);
        System.out.println("  Marks: " + marks);
        System.out.println("  Grade: " + grade);
    }
}

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Student Marks Management System\n");
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        // Create an array of Student objects
        Student[] students = new Student[n];
        
        // Input student details
        System.out.println("\nEnter details for " + n + " students:");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            System.out.print("  Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("  Enter roll number: ");
            int rollNumber = sc.nextInt();
            
            System.out.print("  Enter marks: ");
            double marks = sc.nextDouble();
            sc.nextLine(); // Consume newline
            
            // Initialize student object using constructor
            students[i] = new Student(name, rollNumber, marks);
        }
        
        // Display all students
        System.out.println("\n" + "=".repeat(50));
        System.out.println("All Student Details:");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].display();
            System.out.println("-".repeat(30));
        }
        
        // Calculate average marks
        double totalMarks = 0;
        for (int i = 0; i < n; i++) {
            totalMarks += students[i].getMarks();
        }
        double averageMarks = totalMarks / n;
        
        // Display statistics
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Statistics:");
        System.out.println("=".repeat(50));
        System.out.println("Total Students: " + n);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + String.format("%.2f", averageMarks));
        
        // Find highest and lowest marks
        double highest = students[0].getMarks();
        double lowest = students[0].getMarks();
        
        for (int i = 1; i < n; i++) {
            if (students[i].getMarks() > highest) {
                highest = students[i].getMarks();
            }
            if (students[i].getMarks() < lowest) {
                lowest = students[i].getMarks();
            }
        }
        
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        
        sc.close();
        System.out.println("Sougata Kundu , 24155737");
    }
}
