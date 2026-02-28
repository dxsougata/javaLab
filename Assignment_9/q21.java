import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class q21 {
    public static void main(String[] args) throws IOException {
        String fileName = "students.txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            out.printf("%-10s %-5s %-6s%n", "Name", "Age", "Grade");
            out.printf("%-10s %-5d %-6s%n", "Riya", 20, "A");
            out.printf("%-10s %-5d %-6s%n", "Aman", 19, "B");
            out.printf("%-10s %-5d %-6s%n", "Neha", 21, "A+");
        }

        System.out.println("Written to " + fileName);
    }
}
