package Fundamentals.Arrays;

import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        // 1. Prefix Sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Prefix Running Sum: ");
        for (int num : prefix) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. Range Sum Query
        System.out.println("Enter L and R: ");
        int L = sc.nextInt();
        int R = sc.nextInt();
        if (L == 0) {
            System.out.println(prefix[R]);
        }
        System.out.print(prefix[R] - prefix[L - 1]);
        System.out.println();

        // 3. Equilibrium sum : Index where left sum == right sum
        System.out.println("Equillibrium:");
        int totalSum = 0;
        for (int num : arr)
            totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                System.out.println(i);
                break;
            }
            leftSum += arr[i];
        }

        // 4. Subarray Sum = K
        System.out.println("Subarray Sum = K");
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int num : arr) {
            prefixSum += num;
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        System.out.println("Subarrays with sum " + k + ": " + count);
        sc.close();
    }
}
