package SlidingWindow;

import java.util.*;

public class AverageOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        System.out.printf("%.2f ", (double) windowSum / k);

        for (int i = k; i < n; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];

            System.out.printf("%.2f ", (double) windowSum / k);
        }
        sc.close();
    }
}