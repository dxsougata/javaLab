import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q29 {
    public static void main(String[] args) throws IOException {
        String source = "multi_lines.txt";
        String encrypted = "encrypted.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(encrypted)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch + 1);
            }
        }

        System.out.println("Encrypted to " + encrypted);
    }
}
