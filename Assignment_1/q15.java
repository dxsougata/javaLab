package Assignment_1;
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        float x=0;
        float a;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Full marks in each subject : ");
         float f= sc.nextFloat();
         for(int j=0;j<5;j++){
            System.out.println("Enter " +j+ " subject marks : ");
            a = sc.nextFloat();
            x = x+a;
         }
         float p = (x/(f*5))*100;
         System.out.println("You got "+p+ "%");
         System.out.println("Sougata Kundu");
         System.out.println("24155737");
    }
    
}
