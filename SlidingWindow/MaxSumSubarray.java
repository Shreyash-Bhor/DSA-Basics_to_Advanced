package SlidingWindow;

import java.util.*;

public class MaxSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int windowSum = 0;
        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        // Sliding the window
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
        sc.close();
    }
}
