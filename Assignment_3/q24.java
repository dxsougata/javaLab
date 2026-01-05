import java.util.*;

public class q24 {
    static class Student { String name; int marks; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: "); int n = sc.nextInt();
        List<Student> pass = new ArrayList<>(), fail = new ArrayList<>();
        for (int i=0;i<n;i++){ Student s=new Student(); s.name=sc.next(); s.marks=sc.nextInt(); if (s.marks>=40) pass.add(s); else fail.add(s); }
        sc.close();
        System.out.println("Pass:"); for (Student s: pass) System.out.println(s.name + " " + s.marks);
        System.out.println("Fail:"); for (Student s: fail) System.out.println(s.name + " " + s.marks);
        System.out.println("Sougata Kundu , 24155737");
    }
}
