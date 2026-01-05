import java.util.*;

public class q23 {
    static class Hotel { String name; String city; double rating; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of hotels: "); int n = sc.nextInt();
        Map<String, Hotel> best = new HashMap<>();
        for (int i=0;i<n;i++){
            Hotel h = new Hotel(); h.name=sc.next(); h.city=sc.next(); h.rating=sc.nextDouble();
            Hotel cur = best.get(h.city);
            if (cur==null || h.rating>cur.rating) best.put(h.city, h);
        }
        sc.close();
        for (Map.Entry<String,Hotel> e: best.entrySet()) System.out.println(e.getKey()+": " + e.getValue().name + " (" + e.getValue().rating + ")");
        System.out.println("Sougata Kundu , 24155737");
    }
}
