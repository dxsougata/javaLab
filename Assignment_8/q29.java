public class q29 {
    public static void main(String[] args) {
        String str = "babad";
        String longest = longestPalindrome(str);
        
        System.out.println("String: " + str);
        System.out.println("Longest palindromic substring: " + longest);
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        
        String longest = "";
        for(int i = 0; i < s.length(); i++) {
            String odd = expandAroundCenter(s, i, i);
            String even = expandAroundCenter(s, i, i + 1);
            
            if(odd.length() > longest.length()) longest = odd;
            if(even.length() > longest.length()) longest = even;
        }
        return longest;
    }
    
    public static String expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
