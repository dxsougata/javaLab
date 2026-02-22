public class q22 {
    public static void main(String[] args) {
        String str = "Hello World";
        String search = "World";
        
        int index = myIndexOf(str, search);
        System.out.println("String: " + str);
        System.out.println("Search: " + search);
        System.out.println("Index: " + index);
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static int myIndexOf(String str, String search) {
        if(search.length() > str.length()) return -1;
        
        for(int i = 0; i <= str.length() - search.length(); i++) {
            boolean found = true;
            for(int j = 0; j < search.length(); j++) {
                if(str.charAt(i + j) != search.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if(found) return i;
        }
        return -1;
    }
}
