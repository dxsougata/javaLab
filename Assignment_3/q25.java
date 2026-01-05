import java.util.*;

public class q25 {
    static class Item implements Comparable<Item> { String name; double price; public int compareTo(Item o){ return Double.compare(this.price, o.price);} }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of items: "); int n = sc.nextInt();
        Item[] a = new Item[n];
        for (int i=0;i<n;i++){ a[i]=new Item(); a[i].name=sc.next(); a[i].price=sc.nextDouble(); }
        sc.close();
        Arrays.sort(a);
        Item expensive = a[n-1];
        System.out.println("Most expensive: " + expensive.name + " " + expensive.price);
        System.out.println("Sougata Kundu , 24155737");
    }
}
