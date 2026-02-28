import java.io.FileInputStream;
import java.io.IOException;

public class q14 {
    public static void main(String[] args) throws IOException {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        boolean same = true;

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {
            int ch1;
            int ch2;
            while (true) {
                ch1 = fis1.read();
                ch2 = fis2.read();
                if (ch1 != ch2) {
                    same = false;
                    break;
                }
                if (ch1 == -1) {
                    break;
                }
            }
        }

        System.out.println(same ? "Files are identical." : "Files are different.");
    }
}
