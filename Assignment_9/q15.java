import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q15 {
    public static void main(String[] args) throws IOException {
        String source = "multi_lines.txt";
        String target = "upper.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                char c = (char) ch;
                if (c >= 'a' && c <= 'z') {
                    c = (char) (c - 32);
                }
                fos.write(c);
            }
        }

        System.out.println("Saved to " + target);
    }
}
