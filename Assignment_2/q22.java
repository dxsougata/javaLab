//Create a class Rectangle with length & breadth.
//Write methods to compute area, perimeter and display them.

import java.util.Scanner;

class Rectangle {
	private double length;
	private double breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double area() {
		return length * breadth;
	}

	double perimeter() {
		return 2 * (length + breadth);
	}

	void display() {
		System.out.printf("Length: %.2f, Breadth: %.2f%n", length, breadth);
		System.out.printf("Area: %.2f%n", area());
		System.out.printf("Perimeter: %.2f%n", perimeter());
	}
}

public class q22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter breadth: ");
		double breadth = sc.nextDouble();

		Rectangle rect = new Rectangle(length, breadth);
		rect.display();

		sc.close();
	}
}
