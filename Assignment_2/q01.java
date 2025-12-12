//1. Write a Java program to find the second-largest element in an integer array without sorting.

public class q01 {
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0]=8;
        arr[1]=5;
        arr[2]=6;
        arr[3]=9;
        arr[4]=1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secondMax = max;
                max = arr[i];

            }
        }
        System.out.println("Second max element is : " + secondMax);
        
        
        
    }
    
}
