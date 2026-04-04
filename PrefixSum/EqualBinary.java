package PrefixSum;

import java.util.*;

public class EqualBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            // convert 0 -> -1
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
        int maxLen = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(maxLen);
        sc.close();
    }
}
