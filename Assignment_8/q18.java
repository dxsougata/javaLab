public class q18 {
    public static void main(String[] args) {
        String str = "abc";
        int count = 0;
        
        System.out.println("All substrings of \"" + str + "\":");
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
                count++;
            }
        }
        System.out.println("Total count: " + count);
        System.out.println("Sougata Kundu , 24155737");
    }
}
