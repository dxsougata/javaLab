//Create a class Student with data members (name, roll, marks of 3 subjects).
//Write methods to input details, calculate percentage, and display all details

import java.util.Scanner;

class Student {
	private String name;
	private String roll;
	private int[] marks = new int[3];

	void inputDetails(Scanner sc) {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter roll: ");
		roll = sc.nextLine();
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter marks for subject " + (i + 1) + ": ");
			marks[i] = sc.nextInt();
		}
		sc.nextLine(); // consume trailing newline
	}

	double calculatePercentage() {
		int total = 0;
		for (int m : marks) {
			total += m;
		}
		return (total / 300.0) * 100.0;
	}

	void display() {
		System.out.println("\nStudent Details:");
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.print("Marks: ");
		for (int m : marks) {
			System.out.print(m + " ");
		}
		System.out.println();
		System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
	}
}

public class q21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		student.inputDetails(sc);
		student.display();

		sc.close();
	}
}
