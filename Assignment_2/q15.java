//Write a Java program to find the row with the maximum sum in a 2D matrix.

import java.util.Scanner;

public class q15 {
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

		int maxSum = Integer.MIN_VALUE;
		int maxRowIndex = -1;

		for (int i = 0; i < rows; i++) {
			int rowSum = 0;
			for (int j = 0; j < cols; j++) {
				rowSum += matrix[i][j];
			}
			if (rowSum > maxSum) {
				maxSum = rowSum;
				maxRowIndex = i;
			}
		}

		System.out.println("\nMatrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nRow with maximum sum: " + (maxRowIndex + 1));
		System.out.println("Maximum sum: " + maxSum);

		sc.close();
	}
}
