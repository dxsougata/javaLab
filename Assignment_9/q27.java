import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class q27 {
    public static void main(String[] args) throws IOException {
        String fileName = "datetime.txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            out.println("Current date and time: " + LocalDateTime.now());
        }

        System.out.println("Written to " + fileName);
    }
}
