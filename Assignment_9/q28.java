import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class q28 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";

        long start1 = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            while (fis.read() != -1) {
                // reading byte-by-byte without buffer
            }
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {
            while (bis.read() != -1) {
                // reading byte-by-byte with buffer
            }
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Without buffer: " + (end1 - start1) + " ms");
        System.out.println("With buffer: " + (end2 - start2) + " ms");
    }
}
