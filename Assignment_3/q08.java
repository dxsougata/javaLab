import java.util.*;

public class q08 {

    static class Student {
        int roll;
        String name;
        int marks;
        Student(int r, String n, int m){ roll=r; name=n; marks=m; }
        public String toString(){ return roll+" "+name+" "+marks; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.print("Enter roll name marks: ");
            int r = sc.nextInt(); String name = sc.next(); int m = sc.nextInt();
            list.add(new Student(r, name, m));
        }

        System.out.println("Students:");
        for (Student s: list) System.out.println(s);

        System.out.print("Enter roll number to remove: ");
        int rem = sc.nextInt();
        boolean removed = list.removeIf(s -> s.roll == rem);
        if (removed) System.out.println("Removed student with roll " + rem);
        else System.out.println("No student found with roll " + rem);

        System.out.println("Remaining students:");
        for (Student s: list) System.out.println(s);
        sc.close();
        System.out.println("Sougata Kundu , 24155737");
    }
}
