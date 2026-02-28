import java.io.FileOutputStream;
import java.io.IOException;

public class q06 {
    public static void main(String[] args) throws IOException {
        String fileName = "append_demo.txt";
        String text = "Appended line\n";

        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
            fos.write(text.getBytes());
        }

        System.out.println("Appended to " + fileName);
        System.out.println("Sougata Kundu , 24155737");
    }
}
