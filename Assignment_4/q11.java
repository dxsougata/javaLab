// Question 11: Store details of n employees and display employee with highest salary
import java.util.Scanner;

class Employee {
    private String name;
    private int empId;
    private String department;
    private double salary;
    
    // Constructor to initialize employee details
    public Employee(String name, int empId, String department, double salary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }
    
    // Getter for salary
    public double getSalary() {
        return salary;
    }
    
    // Display employee details
    public void display() {
        System.out.println("  Employee ID: " + empId);
        System.out.println("  Name: " + name);
        System.out.println("  Department: " + department);
        System.out.println("  Salary: $" + salary);
    }
}

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Employee Management System\n");
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        // Create an array of Employee objects
        Employee[] employees = new Employee[n];
        
        // Input employee details
        System.out.println("\nEnter details for " + n + " employees:");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            
            System.out.print("  Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("  Enter employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            System.out.print("  Enter department: ");
            String department = sc.nextLine();
            
            System.out.print("  Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline
            
            // Initialize employee object using constructor
            employees[i] = new Employee(name, empId, department, salary);
        }
        
        // Display all employees
        System.out.println("\n" + "=".repeat(50));
        System.out.println("All Employee Details:");
        System.out.println("=".repeat(50));
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            employees[i].display();
            System.out.println("-".repeat(30));
        }
        
        // Find employee with highest salary
        int maxIndex = 0;
        double maxSalary = employees[0].getSalary();
        
        for (int i = 1; i < n; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxIndex = i;
            }
        }
        
        // Display employee with highest salary
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Employee with Highest Salary:");
        System.out.println("=".repeat(50));
        employees[maxIndex].display();
        System.out.println("\nHighest Salary: $" + maxSalary);
        
        sc.close();
        System.out.println("Sougata Kundu , 24155737");
    }
}
