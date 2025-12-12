//5. Write a Java program to count the frequency of each element in an array (using another array/map logic)

import java.util.HashMap;
import java.util.Map;

public class q05 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 3, 2, 1, 4, 3, 3};

        Map<Integer, Integer> freq = new HashMap<>();

        for (int value : arr) {
           
            freq.put(value, freq.getOrDefault(value, 0) + 1);
        }

        System.out.println("Array elements and their frequencies:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
