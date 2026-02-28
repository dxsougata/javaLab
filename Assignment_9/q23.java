import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class q23 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "menu_file.txt";

        while (true) {
            System.out.println("1. Write");
            System.out.println("2. Read");
            System.out.println("3. Append");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            String choice = reader.readLine();

            if ("1".equals(choice)) {
                System.out.println("Enter text:");
                String text = reader.readLine();
                if (text == null) {
                    text = "";
                }
                try (FileOutputStream fos = new FileOutputStream(fileName)) {
                    fos.write(text.getBytes());
                }
            } else if ("2".equals(choice)) {
                try (FileInputStream fis = new FileInputStream(fileName)) {
                    int ch;
                    while ((ch = fis.read()) != -1) {
                        System.out.print((char) ch);
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println("File not found.");
                }
            } else if ("3".equals(choice)) {
                System.out.println("Enter text:");
                String text = reader.readLine();
                if (text == null) {
                    text = "";
                }
                try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
                    fos.write(text.getBytes());
                }
            } else if ("4".equals(choice)) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
