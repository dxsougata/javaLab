public class q20 {
    public static void main(String[] args) {
        String str = "abcdef";
        
        if(hasUniqueCharacters(str)) {
            System.out.println("\"" + str + "\" has all unique characters");
        } else {
            System.out.println("\"" + str + "\" does not have all unique characters");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static boolean hasUniqueCharacters(String str) {
        boolean[] chars = new boolean[128];
        
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(chars[val]) {
                return false;
            }
            chars[val] = true;
        }
        return true;
    }
}
