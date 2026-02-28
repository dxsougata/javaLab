import java.io.IOException;

public class q03 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type a line and press Enter:");

        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = System.in.read()) != -1 && ch != '\n') {
            if (ch != '\r') {
                sb.append((char) ch);
            }
        }

        System.out.println("You typed: " + sb.toString());
        System.out.println("Sougata Kundu , 24155737");
    }
}
