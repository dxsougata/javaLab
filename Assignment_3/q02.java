public class q02 {
    static class Employee {
        String name;
        int empId;
        double salary;
        
        Employee(String name, int empId, double salary) {
            this.name = name;
            this.empId = empId;
            this.salary = salary;
        }
        
        
        public String toString() {
            return "Name: " + name + ", ID: " + empId + ", Salary: " + salary;
        }
    }
    
    public static void main(String[] args) {
        int n = 6;
        Employee[] employees = new Employee[n];
        
        employees[0] = new Employee("Rohit", 101, 50000);
        employees[1] = new Employee("Anjali", 102, 65000);
        employees[2] = new Employee("Sanjay", 103, 45000);
        employees[3] = new Employee("Deepika", 104, 75000);
        employees[4] = new Employee("Arjun", 105, 55000);
        employees[5] = new Employee("Pooja", 106, 60000);
        
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (employees[j].salary > employees[j + 1].salary) {
                    
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Employees sorted by salary (ascending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
