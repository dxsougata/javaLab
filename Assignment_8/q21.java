public class q21 {
    public static void main(String[] args) {
        String ip = "192.168.1.1";
        
        if(isValidIPv4(ip)) {
            System.out.println(ip + " is a valid IPv4 address");
        } else {
            System.out.println(ip + " is not a valid IPv4 address");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static boolean isValidIPv4(String ip) {
        String[] parts = ip.split("\\.");
        if(parts.length != 4) return false;
        
        for(String part : parts) {
            if(part.length() == 0 || part.length() > 3) return false;
            if(part.charAt(0) == '0' && part.length() > 1) return false;
            
            for(char c : part.toCharArray()) {
                if(c < '0' || c > '9') return false;
            }
            
            int num = Integer.parseInt(part);
            if(num < 0 || num > 255) return false;
        }
        return true;
    }
}
