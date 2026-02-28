import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q01 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name:");
		String name = reader.readLine();

		if (name == null || name.trim().isEmpty()) {
			System.err.println("Error: name cannot be empty.");
			return;
		}

		System.out.println("Hello, " + name + "!");
        System.out.println("Sougata Kundu , 24155737");
	}
}
