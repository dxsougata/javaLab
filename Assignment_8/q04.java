class q04{
    public static void main(String[] args) {
        String str  = "abcde";
        reverse o1 = new reverse();

        System.out.println(o1.reverseWithLoop(str));
        System.out.println(o1.reverseWithRecursion(str));
        System.out.println(o1.reverseWithBuilder(str));
        System.out.println("Sougata Kundu , 24155737");

    }
}

class reverse{
    String reverseWithLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
        }
        return reversed;
    }

    String reverseWithBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    String reverseWithRecursion(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseWithRecursion(str.substring(0, str.length() - 1));
    }
}