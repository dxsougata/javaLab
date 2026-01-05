import java.util.*;

public class q28 {
    static class Student { String name; int marks; char grade; }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i=0;i<n;i++){ s[i]=new Student(); s[i].name=sc.next(); s[i].marks = sc.nextInt();
            int m = s[i].marks;
            if (m>=80) s[i].grade='A'; else if (m>=60) s[i].grade='B'; else if (m>=40) s[i].grade='C'; else s[i].grade='F';
        }
        sc.close();
        for (Student st: s) System.out.println(st.name + " " + st.marks + " " + st.grade);
        System.out.println("Sougata Kundu , 24155737");
    }
}
