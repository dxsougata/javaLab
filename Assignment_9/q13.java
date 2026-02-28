import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q13 {
    public static void main(String[] args) throws IOException {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String merged = "merged.txt";

        try (FileOutputStream fos = new FileOutputStream(merged)) {
            try (FileInputStream fis1 = new FileInputStream(file1)) {
                int ch;
                while ((ch = fis1.read()) != -1) {
                    fos.write(ch);
                }
            }
            try (FileInputStream fis2 = new FileInputStream(file2)) {
                int ch;
                while ((ch = fis2.read()) != -1) {
                    fos.write(ch);
                }
            }
        }

        System.out.println("Merged into " + merged);
    }
}
