import java.util.*;

public class q22 {
    static class BankAccount { String id; double balance; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of accounts: "); int n = sc.nextInt();
        List<BankAccount> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            BankAccount a = new BankAccount(); a.id = sc.next(); a.balance = sc.nextDouble();
            if (a.balance != 0) list.add(a);
        }
        sc.close();
        System.out.println("Non-zero accounts:");
        for (BankAccount a: list) System.out.println(a.id + " " + a.balance);
        System.out.println("Sougata Kundu , 24155737");
    }
}
