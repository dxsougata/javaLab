//7. Write a Java program to check whether two arrays are equal (same elements in same order).
public class q07 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 3, 2, 1, 4, 3, 3};
        int[] arr1 = {4, 2, 4, 3, 2, 1, 4, 3, 2};

        int i = arr.length;
        //int j = arr1.length;
        //int k=0;
        for(int k=0;k<i;k++){
            if(arr[k]!=arr1[k]){
                System.out.println("Both array not same ");
                return;
            }
        }
        System.out.println("Both array are same ");

    }
}
