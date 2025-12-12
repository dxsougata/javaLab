//Write a Java program to find the maximum sum subarray using Kadane’s algorithm.
public class q11 {
	public static void main(String[] args) {
		// Sample input; change values to test other cases
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

		if (arr.length == 0) {
			System.out.println("Array is empty.");
			return;
		}

		Result res = kadane(arr);
		System.out.println("Max subarray sum: " + res.maxSum);
		System.out.println("Start index: " + res.start + ", End index: " + res.end);
		System.out.print("Subarray: ");
		for (int i = res.start; i <= res.end; i++) {
			System.out.print(arr[i] + (i < res.end ? " " : ""));
		}
		System.out.println();
	}

	static Result kadane(int[] arr) {
		int maxSoFar = arr[0];
		int maxEndingHere = arr[0];
		int start = 0, end = 0, s = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxEndingHere + arr[i]) {
				maxEndingHere = arr[i];
				s = i;
			} else {
				maxEndingHere += arr[i];
			}

			if (maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
				start = s;
				end = i;
			}
		}
		return new Result(maxSoFar, start, end);
	}

	static class Result {
		int maxSum;
		int start;
		int end;
		Result(int maxSum, int start, int end) {
			this.maxSum = maxSum;
			this.start = start;
			this.end = end;
		}
	}
}
