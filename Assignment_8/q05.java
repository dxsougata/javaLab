public class q05 {
    public static void main(String[] args) {
        String str  = "abCb a  ";
        str = str.toLowerCase();
        str = str.replaceAll("\\s", "");

        String reversedStr = new StringBuilder(str).reverse().toString();

        if(str.equals(reversedStr)){
            System.out.println("This is a pallindrome string ");
        }else{
            System.out.println("not pallindrome ");
        }
        System.out.println("Sougata Kundu , 24155737");

    }
}
