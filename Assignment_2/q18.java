//Write a Java program to find the transpose of a matrix without using an extra array (in-place transpose).

import java.util.Scanner;

public class q18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		if (rows != cols) {
			System.out.println("In-place transpose requires a square matrix. Rows must equal columns.");
			sc.close();
			return;
		}

		int[][] matrix = new int[rows][cols];
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nOriginal matrix:");
		printMatrix(matrix);

		// In-place transpose: swap only above the main diagonal
		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < cols; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		System.out.println("\nTransposed matrix:");
		printMatrix(matrix);

		sc.close();
	}

	private static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
