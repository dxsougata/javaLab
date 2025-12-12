//Write a Java program to find all pairs of elements whose sum equals a given target (avoid duplicates).

public class q06 {
    public static void main(String[] args) {
        int []arr = {1,3,4,6,5,2};
        int target  = 6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i] + " "+ arr[j]);
                }
            }
        }

    }
}
