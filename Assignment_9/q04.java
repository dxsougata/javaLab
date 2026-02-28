import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q04 {
    public static void main(String[] args) throws IOException {
        String fileName = "single_byte.txt";
        byte value = 65; // 'A'

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(value);
        }

        int readValue;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            readValue = fis.read();
        }

        System.out.println("Stored byte: " + readValue);
        System.out.println("Stored character: " + (char) readValue);
        System.out.println("Sougata Kundu , 24155737");
    }
}
