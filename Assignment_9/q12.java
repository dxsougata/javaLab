import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q12 {
    public static void main(String[] args) throws IOException {
        String source = "multi_lines.txt";
        String target = "copy.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
        }

        System.out.println("Copied to " + target);
    }
}
