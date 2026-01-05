public class q36 {
    public static void main(String[] args){
        if (args.length==0){ System.out.println("Provide a single string as arg"); return; }
        String s = args[0];
        int upper=0, lower=0, digits=0, special=0;
        for (char c: s.toCharArray()){
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
            else if (Character.isDigit(c)) digits++;
            else special++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
        System.out.println("Sougata Kundu , 24155737");
    }
}
