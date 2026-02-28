import java.io.FileInputStream;
import java.io.IOException;

public class q09 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }
}
