import java.util.*;

public class q29 {
    static class Employee { String name; String role; double salary; }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Employee[] e = new Employee[n];
        for (int i=0;i<n;i++){ e[i]=new Employee(); e[i].name=sc.next(); e[i].role=sc.next(); e[i].salary=sc.nextDouble(); }
        sc.close();
        Map<Double, List<Employee>> map = new HashMap<>();
        for (Employee emp: e) map.computeIfAbsent(emp.salary, k->new ArrayList<>()).add(emp);
        for (Map.Entry<Double,List<Employee>> en: map.entrySet()){
            List<Employee> list = en.getValue();
            Set<String> roles = new HashSet<>();
            for (Employee emp: list) roles.add(emp.role);
            if (list.size()>1 && roles.size()>1) {
                System.out.println("Salary: " + en.getKey());
                for (Employee emp: list) System.out.println(emp.name + " " + emp.role);
            }
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
