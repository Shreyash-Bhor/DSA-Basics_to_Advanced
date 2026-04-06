package Greedy;

import java.util.*;

public class MinimumPlatforms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            dep[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int platforms = 0, maxPlatforms = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }
        System.out.println(maxPlatforms);
        sc.close();
    }
}
