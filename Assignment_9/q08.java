import java.io.FileInputStream;
import java.io.IOException;

public class q08 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int value = fis.read();
            if (value == -1) {
                System.out.println("File is empty.");
                return;
            }
            System.out.println("First character: " + (char) value);
        }
    }
}
