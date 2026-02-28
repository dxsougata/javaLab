import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "multi_lines.txt";
        String output = "replaced.txt";

        System.out.println("Find word:");
        String find = reader.readLine();
        System.out.println("Replace with:");
        String replace = reader.readLine();

        if (find == null || find.isEmpty()) {
            System.out.println("Nothing to replace.");
            return;
        }
        if (replace == null) {
            replace = "";
        }

        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                sb.append((char) ch);
            }
        }

        String updated = sb.toString().replace(find, replace);
        try (FileOutputStream fos = new FileOutputStream(output)) {
            fos.write(updated.getBytes());
        }

        System.out.println("Saved to " + output);
    }
}
