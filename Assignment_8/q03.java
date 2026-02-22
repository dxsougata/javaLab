public class q03 {
    public static void main(String[] args) {

        String input = "Abc123#$";
        String str = input.toLowerCase();

        int digits=0,vowels=0,consonants=0,specialChars=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (Character.isDigit(ch)) {
                digits++;
            } 
            
            else if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
          
            else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
    }
            System.out.println("Vowel : "+vowels);
            System.out.println("Consonent : "+consonants);
            System.out.println("Digits : "+digits);
            System.out.println("SpecialChar : "+specialChars);
            System.out.println("Sougata Kundu , 24155737");
}
}
