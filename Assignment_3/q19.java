import java.util.*;

public class q19 {
    static class Student { String name; int total; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: "); int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i=0;i<n;i++){
            s[i]=new Student();
            System.out.print("Name: "); s[i].name = sc.next();
            System.out.print("Marks for 3 subjects: ");
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
            s[i].total = a+b+c;
        }
        sc.close();
        Arrays.sort(s, (x,y)-> Integer.compare(y.total, x.total));
        System.out.println("Rankings:");
        for (int i=0;i<n;i++) System.out.println((i+1)+". " + s[i].name + " ("+s[i].total+")");
        System.out.println("Sougata Kundu , 24155737");
    }
}
