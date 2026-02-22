public class q13 {
    public static void main(String[] args) {
        String str = "This   is   a    test   string";
        String result = replaceMultipleSpaces(str);
        
        System.out.println("Original: \"" + str + "\"");
        System.out.println("Result: \"" + result + "\"");
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static String replaceMultipleSpaces(String str) {
        StringBuilder result = new StringBuilder();
        boolean prevSpace = false;
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') {
                if(!prevSpace) {
                    result.append(ch);
                    prevSpace = true;
                }
            } else {
                result.append(ch);
                prevSpace = false;
            }
        }
        return result.toString();
    }
}
