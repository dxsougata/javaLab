//4. Write a Java program to merge two sorted arrays into a new sorted array (without using built-in sort).

public class q04 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];
        
        int i = 0, j = 0, k = 0;
        
        // Merge two sorted arrays
        while(i < n && j < m) {
            if(arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        
        
        while(i < n) {
            merged[k++] = arr1[i++];
        }
        
        
        while(j < m) {
            merged[k++] = arr2[j++];
        }
        
        System.out.println("First sorted array: ");
        for(int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("Second sorted array: ");
        for(int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("Merged sorted array: ");
        for(int x : merged) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
}
