import java.util.Scanner;

public class q12 {

    public static void main(String[] args) {
        System.out.println("Sougata Kundu  , 24155737");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Customer[] c = new Customer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and email");
            c[i] = new Customer();
            c[i].name = sc.next();
            c[i].email = sc.next();
        }
        System.out.println("Enter the Email to be searched");
        String Email = sc.next();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (c[i].email.equals(Email)) {
                System.out.println(c[i].name + " " + c[i].email);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Customer not found");
        }
        sc.close();
        System.out.println("Sougata Kundu , 24155737");
    }

}

class Customer {
    String name;
    String email;
}
