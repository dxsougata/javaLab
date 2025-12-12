//Write a Java program to input a 2D matrix and check whether it is a sparse matrix.
import java.util.Scanner;

public class q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];
		int zeroCount = 0;

		System.out.println("Enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] == 0) {
					zeroCount++;
				}
			}
		}

		int total = rows * cols;
		boolean isSparse = zeroCount > total / 2;

		System.out.println("\nMatrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nZero elements: " + zeroCount + " out of " + total);
		System.out.println("Is sparse: " + isSparse);

		sc.close();
	}
}
