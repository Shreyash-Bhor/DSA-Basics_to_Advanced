package HashMap;

import java.util.*;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == target) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                found = true;
                break;
            }
            if (map.containsKey(sum - target)) {
                int start = map.get(sum - target) + 1;
                for (int j = start; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                found = true;
                break;

            }
            map.put(sum, i);

        }
        if (!found) {
            System.out.println("Subarray not found");
        }
        sc.close();
    }
}
