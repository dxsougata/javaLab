import java.util.*;

public class q17 {
    static class Vehicle { String name; int wheels; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of vehicles: ");
        int n = sc.nextInt();
        Vehicle[] v = new Vehicle[n];
        System.out.println("Enter name and number of wheels:");
        for (int i=0;i<n;i++){
            v[i]=new Vehicle();
            v[i].name = sc.next(); v[i].wheels = sc.nextInt();
        }
        sc.close();
        System.out.println("Two-wheelers:");
        for (Vehicle x: v) if (x.wheels==2) System.out.println(x.name);
        System.out.println("Four-wheelers:");
        for (Vehicle x: v) if (x.wheels==4) System.out.println(x.name);
        System.out.println("Sougata Kundu , 24155737");
    }
}
