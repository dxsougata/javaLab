// Write a Java program to find the longest increasing subsequence (LIS) (basic LIS logic allowed).
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q10 {
    public static void main(String[] args) {
        // Sample input array; change values to test other cases
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};

        int n = arr.length;
        if (n == 0) {
            System.out.println("LIS length: 0\nLIS: []");
            return;
        }

        // dp[i] = length of LIS ending at i
        int[] dp = new int[n];
        // parent[i] = previous index in LIS ending at i (for reconstruction)
        int[] parent = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            parent[i] = -1;
        }

        int maxLen = 1;
        int lastIdx = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIdx = i;
            }
        }

        // Reconstruct one LIS
        List<Integer> lis = new ArrayList<>();
        for (int k = lastIdx; k != -1; k = parent[k]) {
            lis.add(arr[k]);
        }
        Collections.reverse(lis);

        System.out.println("LIS length: " + maxLen);
        System.out.println("LIS: " + lis);
    }
}
