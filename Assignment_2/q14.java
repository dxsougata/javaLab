//Write a Java program to multiply two matrices (check dimension validity).

import java.util.Scanner;

public class q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows and columns of first matrix (r1 c1): ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();

		System.out.print("Enter rows and columns of second matrix (r2 c2): ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

		if (c1 != r2) {
			System.out.println("Matrix multiplication not possible: c1 must equal r2.");
			sc.close();
			return;
		}

		int[][] a = new int[r1][c1];
		int[][] b = new int[r2][c2];

		System.out.println("Enter elements of first matrix:");
		readMatrix(sc, a);

		System.out.println("Enter elements of second matrix:");
		readMatrix(sc, b);

		int[][] product = multiply(a, b);

		System.out.println("First matrix:");
		printMatrix(a);
		System.out.println("Second matrix:");
		printMatrix(b);
		System.out.println("Product matrix:");
		printMatrix(product);

		sc.close();
	}

	private static int[][] multiply(int[][] a, int[][] b) {
		int r1 = a.length;
		int c1 = a[0].length;
		int c2 = b[0].length;
		int[][] res = new int[r1][c2];

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				int sum = 0;
				for (int k = 0; k < c1; k++) {
					sum += a[i][k] * b[k][j];
				}
				res[i][j] = sum;
			}
		}
		return res;
	}

	private static void readMatrix(Scanner sc, int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = sc.nextInt();
			}
		}
	}

	private static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
