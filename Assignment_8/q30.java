import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- String Utility System ---");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Reverse String");
            System.out.println("3. Count Vowels and Consonants");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Count Words");
            System.out.println("7. Check Anagram");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter string: ");
                    String s1 = sc.nextLine();
                    System.out.println(isPalindrome(s1) ? "Palindrome" : "Not Palindrome");
                    break;
                case 2:
                    System.out.print("Enter string: ");
                    String s2 = sc.nextLine();
                    System.out.println("Reversed: " + reverse(s2));
                    break;
                case 3:
                    System.out.print("Enter string: ");
                    String s3 = sc.nextLine();
                    countVowelsConsonants(s3);
                    break;
                case 4:
                    System.out.print("Enter string: ");
                    String s4 = sc.nextLine();
                    System.out.println("Uppercase: " + toUpper(s4));
                    break;
                case 5:
                    System.out.print("Enter string: ");
                    String s5 = sc.nextLine();
                    System.out.println("Lowercase: " + toLower(s5));
                    break;
                case 6:
                    System.out.print("Enter string: ");
                    String s6 = sc.nextLine();
                    System.out.println("Word count: " + countWords(s6));
                    break;
                case 7:
                    System.out.print("Enter first string: ");
                    String a1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String a2 = sc.nextLine();
                    System.out.println(isAnagram(a1, a2) ? "Anagram" : "Not Anagram");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 8);
        
        System.out.println("Sougata Kundu , 24155737");
        sc.close();
    }
    
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
    
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    public static void countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for(char c : s.toLowerCase().toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                if("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
    
    public static String toUpper(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
        }
        return new String(chars);
    }
    
    public static String toLower(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
            }
        }
        return new String(chars);
    }
    
    public static int countWords(String s) {
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
    
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] freq = new int[128];
        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int f : freq) {
            if(f != 0) return false;
        }
        return true;
    }
}
