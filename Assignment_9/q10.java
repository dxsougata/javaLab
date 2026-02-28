import java.io.FileInputStream;
import java.io.IOException;

public class q10 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";
        int count = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.read() != -1) {
                count++;
            }
        }

        System.out.println("Total characters: " + count);
    }
}
