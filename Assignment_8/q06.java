public class q06 {
    public static void main(String[] args) {
        String input = "Dog barks";
        int count = 0;
        boolean isWord = false;
        int endOfLine = input.length() - 1;

        for(int i=0;i<input.length();i++){
            if (input.charAt(i) != ' ' && input.charAt(i) != '\t') {
                isWord = true;
            } 

            else if (isWord) {
                count++;
                isWord = false;
            }

            if (i == endOfLine && isWord) {
                count++;
            }

            }
            System.out.println(count);
            System.out.println("Sougata Kundu , 24155737");
        }
    }

