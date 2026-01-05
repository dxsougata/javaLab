import java.util.*;

public class q14 {
    static class Train { String name, src, dest; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of trains: ");
        int n = sc.nextInt();
        Train[] t = new Train[n];
        for (int i=0;i<n;i++){
            t[i]=new Train();
            System.out.print("Train name: "); t[i].name = sc.next();
            System.out.print("Source: "); t[i].src = sc.next();
            System.out.print("Destination: "); t[i].dest = sc.next();
        }
        System.out.print("Enter source: "); String s = sc.next();
        System.out.print("Enter destination: "); String d = sc.next();
        sc.close();
        System.out.println("Trains between " + s + " and " + d + ":");
        for (Train tr: t) if (tr.src.equalsIgnoreCase(s) && tr.dest.equalsIgnoreCase(d))
            System.out.println(tr.name);
        System.out.println("Sougata Kundu , 24155737");
    }
}
