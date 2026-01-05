import java.util.*;

public class q26 {
    static class Employee { String name; int years; double salary; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of employees: "); int n=sc.nextInt();
        for (int i=0;i<n;i++){
            Employee e = new Employee(); e.name=sc.next(); e.years=sc.nextInt(); e.salary=sc.nextDouble();
            if (e.years >= 5) e.salary *= 1.10; // 10% for >=5 years
            System.out.println(e.name + " " + e.salary);
        }
        sc.close();
        System.out.println("Sougata Kundu , 24155737");
    }
}
