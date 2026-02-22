import java.util.LinkedHashSet;
import java.util.Set;

public class q07 {
    public static void main(String[] args) {
        String input = "programming is fun";
        System.out.println("Original: " + input);
        System.out.println("Result:   " + removeDuplicates(input));
        System.out.println("Sougata Kundu , 24155737");
    }

    public static String removeDuplicates(String str) {
       
        Set<Character> charSet = new LinkedHashSet<>();
        
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }

        
        StringBuilder sb = new StringBuilder();
        for (Character ch : charSet) {
            sb.append(ch);
        }

        return sb.toString();
    }
}