public class q17 {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        
        if(isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        String concat = s1 + s1;
        return concat.contains(s2);
    }
}
