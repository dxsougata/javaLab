public class q23 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hallo";
        
        if(differByOneChar(str1, str2)) {
            System.out.println("Strings differ by exactly one character");
        } else {
            System.out.println("Strings do not differ by exactly one character");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static boolean differByOneChar(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        
        int differences = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                differences++;
            }
        }
        return differences == 1;
    }
}
