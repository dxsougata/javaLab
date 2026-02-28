import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class q24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "numbers.txt";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter integer " + i + ": ");
                String line = reader.readLine();
                if (line == null) {
                    line = "0";
                }
                fos.write(line.getBytes());
                fos.write('\n');
            }
        }

        int sum = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                if (ch == '\n') {
                    String s = sb.toString().trim();
                    if (!s.isEmpty()) {
                        sum += Integer.parseInt(s);
                        count++;
                    }
                    sb.setLength(0);
                } else if (ch != '\r') {
                    sb.append((char) ch);
                }
            }
            String s = sb.toString().trim();
            if (!s.isEmpty()) {
                sum += Integer.parseInt(s);
                count++;
            }
        }

        double avg = count == 0 ? 0 : (double) sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
