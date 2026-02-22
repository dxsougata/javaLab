public class q01 {
    public static void main(String[] args) {
        String s1 = "KIIT";
        String s2 = "KIIT";

        
        String s3 = new String("KIIT");
        String s4 = new String("KIIT");

        System.out.println("--- Comparison Results ---");

        
        System.out.println("s1 == s2: " + (s1 == s2));           
        System.out.println("s1.equals(s2): " + s1.equals(s2));   


        System.out.println("s1 == s3: " + (s1 == s3));           
        System.out.println("s1.equals(s3): " + s1.equals(s3));   

     
        System.out.println("s3 == s4: " + (s3 == s4));           
        System.out.println("s3.equals(s4): " + s3.equals(s4));   
        System.out.println("Sougata Kundu , 24155737");
    }
}