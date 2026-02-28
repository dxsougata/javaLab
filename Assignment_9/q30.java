import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q30 {
    public static void main(String[] args) throws IOException {
        String encrypted = "encrypted.txt";
        String restored = "decrypted.txt";

        try (FileInputStream fis = new FileInputStream(encrypted);
             FileOutputStream fos = new FileOutputStream(restored)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch - 1);
            }
        }

        System.out.println("Decrypted to " + restored);
    }
}
