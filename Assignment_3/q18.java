import java.util.*;

public class q18 {
    static class Product { String name; double price; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of products: "); int n = sc.nextInt();
        Product[] p = new Product[n];
        for (int i=0;i<n;i++){
            p[i]=new Product();
            System.out.print("Name: "); p[i].name = sc.next();
            System.out.print("Price: "); p[i].price = sc.nextDouble();
        }
        System.out.print("Discount threshold price: "); double threshold = sc.nextDouble();
        System.out.print("Discount percent (e.g., 10 for 10%): "); double percent = sc.nextDouble();
        sc.close();
        for (Product prod: p) {
            if (prod.price > threshold) {
                double newPrice = prod.price * (1 - percent/100.0);
                System.out.println(prod.name + ": " + newPrice);
            } else System.out.println(prod.name + ": " + prod.price);
        }
        System.out.println("Sougata Kundu , 24155737");
    }
}
