import java.io.*;

public class q39 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) { System.out.println("Usage: filename word"); return; }
        String filename = args[0]; String word = args[1];
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\W+");
                for (String p: parts) if (p.equals(word)) count++;
            }
        }
        System.out.println("Occurrences: " + count);
        System.out.println("Sougata Kundu , 24155737");
    }
}
