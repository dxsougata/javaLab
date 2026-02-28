import java.io.FileInputStream;
import java.io.IOException;

public class q22 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int value;
            while ((value = fis.read()) != -1) {
                System.out.println(value + " -> " + (char) value);
            }
        }
    }
}
