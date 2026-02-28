import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class q05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string to store in file:");
        String text = reader.readLine();

        if (text == null) {
            text = "";
        }

        String fileName = "user_string.txt";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(text.getBytes());
        }

        System.out.println("Saved to " + fileName);
        System.out.println("Sougata Kundu , 24155737");
    }
    
}
