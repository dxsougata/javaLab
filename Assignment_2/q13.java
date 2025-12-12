//Write a Java program to add two 2D matrices of user-given size.

import java.util.Scanner;

public class q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];
		int[][] sum = new int[rows][cols];

		System.out.println("Enter elements of first matrix:");
		readMatrix(sc, a);

		System.out.println("Enter elements of second matrix:");
		readMatrix(sc, b);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("First matrix:");
		printMatrix(a);
		System.out.println("Second matrix:");
		printMatrix(b);
		System.out.println("Sum matrix:");
		printMatrix(sum);

		sc.close();
	}

	private static void readMatrix(Scanner sc, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
