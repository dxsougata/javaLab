import java.io.IOException;

public class q02 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a single character:");
        int value = System.in.read();

        if (value == -1) {
            System.out.println("No input received.");
            return;
        }

        char ch = (char) value;
        System.out.println("ASCII value: " + value);
        System.out.println("Character: " + ch);
        System.out.println("Sougata Kundu , 24155737");
    }
}
