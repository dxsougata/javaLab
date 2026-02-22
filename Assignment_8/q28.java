public class q28 {
    public static void main(String[] args) {
        String text = "Hello World";
        int shift = 3;
        
        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);
        
        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch = (char)((ch - 'a' + shift) % 26 + 'a');
            } else if(ch >= 'A' && ch <= 'Z') {
                ch = (char)((ch - 'A' + shift) % 26 + 'A');
            }
            result.append(ch);
        }
        return result.toString();
    }
    
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }
}
