import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class q19 {
    public static void main(String[] args) {
        try {
            new FileInputStream("no_such_file.txt");
            System.out.println("Opened file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
