public class q25 {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        
        if(followsPattern(pattern, str)) {
            System.out.println("\"" + str + "\" follows pattern \"" + pattern + "\"");
        } else {
            System.out.println("\"" + str + "\" does not follow pattern \"" + pattern + "\"");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static boolean followsPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length) return false;
        
        String[] map = new String[128];
        boolean[] used = new boolean[words.length];
        
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map[ch] == null) {
                for(int j = 0; j < i; j++) {
                    if(words[j].equals(words[i]) && pattern.charAt(j) != ch) return false;
                }
                for(int j = 0; j < i; j++) {
                    if(map[pattern.charAt(j)] != null && map[pattern.charAt(j)].equals(words[i])) return false;
                }
                map[ch] = words[i];
            } else {
                if(!map[ch].equals(words[i])) return false;
            }
        }
        return true;
    }
}
