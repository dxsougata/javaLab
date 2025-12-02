package Assignment_1;

public class q19 {
    public static void main(String[] args) {
        int originalNumber = 12345;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10; 
            reversedNumber = reversedNumber * 10 + remainder; 
            originalNumber = originalNumber / 10;
        }

        System.out.println("Reversed Number: " + reversedNumber); 
        System.out.println("Sougata Kundu");
         System.out.println("24155737");
    }
}
    

    

