public class q16 {
    public static void main(String[] args) {
        String password = "Pass@123";
        
        if(validatePassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
        System.out.println("Sougata Kundu , 24155737");
    }
    
    public static boolean validatePassword(String pwd) {
        if(pwd.length() < 8) return false;
        
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        
        for(int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if(ch >= 'A' && ch <= 'Z') hasUpper = true;
            else if(ch >= 'a' && ch <= 'z') hasLower = true;
            else if(ch >= '0' && ch <= '9') hasDigit = true;
            else hasSpecial = true;
        }
        
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
