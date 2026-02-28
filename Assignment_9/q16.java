import java.io.FileInputStream;
import java.io.IOException;

public class q16 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";
        int lines = 0;
        int words = 0;
        boolean inWord = false;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                char c = (char) ch;
                if (c == '\n') {
                    lines++;
                }
                if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
                    inWord = false;
                } else if (!inWord) {
                    words++;
                    inWord = true;
                }
            }
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
    }
}
