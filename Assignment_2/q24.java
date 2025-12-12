//Create a class Box with (height, width, depth) and compute volume.
//Create two objects and compare which box has larger volume.

import java.util.Scanner;

class Box {
	private double height;
	private double width;
	private double depth;

	Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	double volume() {
		return height * width * depth;
	}
}

public class q24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter dimensions for Box 1 (height width depth): ");
		double h1 = sc.nextDouble();
		double w1 = sc.nextDouble();
		double d1 = sc.nextDouble();

		System.out.println("Enter dimensions for Box 2 (height width depth): ");
		double h2 = sc.nextDouble();
		double w2 = sc.nextDouble();
		double d2 = sc.nextDouble();

		Box box1 = new Box(h1, w1, d1);
		Box box2 = new Box(h2, w2, d2);

		double vol1 = box1.volume();
		double vol2 = box2.volume();

		System.out.printf("Volume of Box 1: %.2f%n", vol1);
		System.out.printf("Volume of Box 2: %.2f%n", vol2);

		if (vol1 > vol2) {
			System.out.println("Box 1 has the larger volume.");
		} else if (vol2 > vol1) {
			System.out.println("Box 2 has the larger volume.");
		} else {
			System.out.println("Both boxes have the same volume.");
		}

		sc.close();
	}
}
