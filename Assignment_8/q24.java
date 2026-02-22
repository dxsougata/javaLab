public class q24 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of \"" + str + "\":");
        generatePermutations(str, "");
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static void generatePermutations(String str, String prefix) {
        if(str.length() == 0) {
            System.out.println(prefix);
        } else {
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + ch);
            }
        }
    }
}
