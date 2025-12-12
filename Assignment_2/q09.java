//Write a Java program to separate even and odd numbers into two different arrays

public class q09 {
    public static void main(String[] args) {
        int[] arr = {12, 17, 8, 23, 14, 5, 30, 21};
        
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        
        int evenIndex = 0, oddIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even[evenIndex++] = arr[i];
            } else {
                odd[oddIndex++] = arr[i];
            }
        }
        System.out.println("Original array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("\nEven numbers:");
        for(int num : even) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("\nOdd numbers:");
        for(int num : odd) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
