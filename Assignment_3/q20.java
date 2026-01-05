import java.util.*;

public class q20 {
    static class Employee { String name, dept; double salary; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of employees: "); int n = sc.nextInt();
        Employee[] e = new Employee[n];
        for (int i=0;i<n;i++){
            e[i]=new Employee();
            System.out.print("Name: "); e[i].name = sc.next();
            System.out.print("Dept: "); e[i].dept = sc.next();
            System.out.print("Salary: "); e[i].salary = sc.nextDouble();
        }
        sc.close();
        Map<String, Employee> best = new HashMap<>();
        for (Employee emp: e) {
            Employee cur = best.get(emp.dept);
            if (cur==null || emp.salary>cur.salary) best.put(emp.dept, emp);
        }
        for (String d: best.keySet()) {
            Employee emp = best.get(d);
            System.out.println("Dept: " + d + ", Employee: " + emp.name + ", Salary: " + emp.salary);
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
