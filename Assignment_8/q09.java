public class q09 {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        System.out.println("IsAnagram : "+isAnagram(str1,str2));
        System.out.println("Sougata Kundu , 24155737");
    }


    public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false;
    }

    int[] charCounts = new int[128];

    for (int i = 0; i < s1.length(); i++) {
        charCounts[s1.charAt(i)]++;
        charCounts[s2.charAt(i)]--;
    }

    for (int count : charCounts) {
        if (count != 0) {
            return false;
        }
    }

    return true;
}
}
