public class q12 {
    public static void main(String[] args) {
        String str = "Hello World 123";
        String result = toggleCase(str);
        
        System.out.println("Original: " + str);
        System.out.println("Toggled: " + result);
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static String toggleCase(String str) {
        char[] chars = str.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
            } else if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
        }
        return new String(chars);
    }
}
