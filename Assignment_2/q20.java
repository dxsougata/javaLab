//Write a Java program to input an array and shift all zeroes to the end while maintaining order of non-zero elements.

import java.util.Scanner;

public class q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		moveZeroesToEnd(arr);

		System.out.println("Array after shifting zeroes to end:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		sc.close();
	}

	// Stable in-place move-zeroes
	private static void moveZeroesToEnd(int[] arr) {
		int write = 0; // next position to place a non-zero
		for (int read = 0; read < arr.length; read++) {
			if (arr[read] != 0) {
				arr[write] = arr[read];
				write++;
			}
		}
		while (write < arr.length) {
			arr[write] = 0;
			write++;
		}
	}
}
