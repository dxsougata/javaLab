import java.util.*;

public class q13 {
    static class Student { 
        String name;
        int marks; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        int sum = 0;
        int hi = Integer.MIN_VALUE, lo = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.print("Name: "); s[i].name = sc.next();
            System.out.print("Marks: "); s[i].marks = sc.nextInt();
            sum += s[i].marks;
            hi = Math.max(hi, s[i].marks);
            lo = Math.min(lo, s[i].marks);
        }
        sc.close();
        double avg = n>0 ? (double)sum/n : 0;
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + hi);
        System.out.println("Lowest: " + lo);
        System.out.println("Sougata Kundu , 24155737");
    }
}
