public class q10 {
    public static void main(String[] args) {
        String str = "leetcode";
        char result = firstNonRepeating(str);
        
        if(result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static char firstNonRepeating(String str) {
        int[] freq = new int[128];
        
        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        for(int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
}
