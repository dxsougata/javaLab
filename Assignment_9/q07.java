import java.io.FileOutputStream;
import java.io.IOException;

public class q07 {
    public static void main(String[] args) throws IOException {
        String fileName = "multi_lines.txt";
        String[] lines = {"Line 1", "Line 2", "Line 3"};

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (String line : lines) {
                fos.write(line.getBytes());
                fos.write('\n');
            }
        }

        System.out.println("Wrote lines to " + fileName);
        System.out.println("Sougata Kundu , 24155737");
    }
}
