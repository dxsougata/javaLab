// Write a Java program to print the boundary elements of a 2D matrix.

import java.util.Scanner;

public class q17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] mat = new int[rows][cols];

		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nMatrix:");
		printMatrix(mat);

		System.out.println("Boundary elements:");
		printBoundary(mat);

		sc.close();
	}

	private static void printBoundary(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;

		// Single row case
		if (rows == 1) {
			for (int j = 0; j < cols; j++) {
				System.out.print(mat[0][j] + " ");
			}
			System.out.println();
			return;
		}

		// Single column case
		if (cols == 1) {
			for (int i = 0; i < rows; i++) {
				System.out.print(mat[i][0] + " ");
			}
			System.out.println();
			return;
		}

		// Top row
		for (int j = 0; j < cols; j++) {
			System.out.print(mat[0][j] + " ");
		}
		// Right column (excluding corners already printed)
		for (int i = 1; i < rows - 1; i++) {
			System.out.print(mat[i][cols - 1] + " ");
		}
		// Bottom row (right to left)
		for (int j = cols - 1; j >= 0; j--) {
			System.out.print(mat[rows - 1][j] + " ");
		}
		// Left column (bottom to top, excluding corners)
		for (int i = rows - 2; i > 0; i--) {
			System.out.print(mat[i][0] + " ");
		}
		System.out.println();
	}

	private static void printMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
