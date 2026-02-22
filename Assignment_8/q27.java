public class q27 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        
        if(isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a valid palindrome");
        } else {
            System.out.println("\"" + str + "\" is not a valid palindrome");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while(left < right) {
            while(left < right && !isAlphanumeric(str.charAt(left))) {
                left++;
            }
            while(left < right && !isAlphanumeric(str.charAt(right))) {
                right--;
            }
            
            char l = Character.toLowerCase(str.charAt(left));
            char r = Character.toLowerCase(str.charAt(right));
            
            if(l != r) return false;
            left++;
            right--;
        }
        return true;
    }
    
    public static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
