import java.util.*;

public class q30 {
    static class Hotel { String name; double rating; double price; }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hotel[] h = new Hotel[n];
        for (int i=0;i<n;i++){ h[i]=new Hotel(); h[i].name=sc.next(); h[i].rating=sc.nextDouble(); h[i].price=sc.nextDouble(); }
        sc.close();
        Arrays.sort(h, (a,b)->{ int r = Double.compare(b.rating, a.rating); return r!=0? r : Double.compare(a.price, b.price); });
        for (Hotel x: h) System.out.println(x.name + " " + x.rating + " " + x.price);
        System.out.println("Sougata Kundu , 24155737");
    }
}
