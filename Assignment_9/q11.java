import java.io.FileInputStream;
import java.io.IOException;

public class q11 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                char c = (char) ch;
                if (c >= '0' && c <= '9') {
                    digits++;
                } else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                    char lower = (char) (c | 32);
                    if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                    special++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }
}
