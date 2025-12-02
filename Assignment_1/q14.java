package Assignment_1;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        int p = sc.nextInt();
        System.out.println("Enter duration in year : ");
        int t = sc.nextInt();
        System.out.println("Enter interest rate : ");
        int r = sc.nextInt();

        int i=(p*t*r)/100;

        System.out.println("Interest is : "+i);
        System.out.println("Sougata Kundu");
        System.out.println("24155737");
    }
    
}
