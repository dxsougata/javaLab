//2. Write a Java program to remove duplicate elements from an array and print the new array size.

import java.util.ArrayList;

public class q02 {
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0]=8;
        arr[1]=5;
        arr[2]=6;
        arr[3]=8;
        arr[4]=5;

        ArrayList<Integer> newarray = new ArrayList<>();
        for(int i=0 ; i<arr.length;i++){
            boolean found = false;
            for(int k=0;k<newarray.size();k++){
                if(newarray.get(k)==arr[i]){
                    found = true;
                    break;
                }
            }
            if(!found){
                newarray.add(arr[i]);
            }
        }
        System.out.println("New arr size is : " + newarray.size());
        for(int i=0;i<newarray.size();i++){
            System.out.println(newarray.get(i));
        }
      
    }
}
