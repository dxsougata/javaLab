import java.util.*;

public class q15 {
    static class Mobile { String model; double price; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of mobiles: ");
        int n = sc.nextInt();
        Mobile[] m = new Mobile[n];
        int r1=0,r2=0,r3=0; // ranges: <=10000, 10001-20000, >20000
        for (int i=0;i<n;i++){
            m[i]=new Mobile();
            System.out.print("Model: "); m[i].model = sc.next();
            System.out.print("Price: "); m[i].price = sc.nextDouble();
            if (m[i].price <= 10000) r1++; else if (m[i].price <=20000) r2++; else r3++;
        }
        sc.close();
        System.out.println("<=10000: " + r1);
        System.out.println("10001-20000: " + r2);
        System.out.println(">20000: " + r3);
        System.out.println("Sougata Kundu , 24155737");
    }
}
