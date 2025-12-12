//Write a Java program to sort each row of a 2D matrix individually.

import java.util.Arrays;
import java.util.Scanner;

public class q19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nOriginal matrix:");
		printMatrix(matrix);

		// Sort each row independently
		for (int i = 0; i < rows; i++) {
			Arrays.sort(matrix[i]);
		}

		System.out.println("\nMatrix after sorting each row:");
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
