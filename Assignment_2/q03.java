//3. Write a Java program to rotate an array by K positions to the right (user inputs K).
import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter K (positions to rotate right): ");
        int k = sc.nextInt();
        k = k % n;  // Handle k > n
        
        // Rotate array by k positions to the right
        for(int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for(int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        
        System.out.println("Rotated array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
