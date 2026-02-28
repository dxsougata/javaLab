import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q20 {
    public static void main(String[] args) throws IOException {
        String inputFile = "multi_lines.txt";
        String outputFile = "out_copy.txt";

        try (FileInputStream fis = new FileInputStream(inputFile)) {
            System.out.println("InputStream reads bytes from a file.");
            int first = fis.read();
            if (first != -1) {
                System.out.println("First byte: " + first);
            }
        }

        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            System.out.println("OutputStream writes bytes to a file.");
            String text = "Written using OutputStream\n";
            fos.write(text.getBytes());
        }

        System.out.println("Wrote to " + outputFile);
    }
}
