import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class q26 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter filename to delete:");
        String fileName = reader.readLine();

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        if (file.delete()) {
            System.out.println("File deleted.");
        } else {
            System.out.println("Unable to delete file.");
        }
    }
}
