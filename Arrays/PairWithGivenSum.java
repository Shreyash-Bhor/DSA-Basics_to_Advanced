package Arrays;

import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) {
                System.out.println(complement + " " + arr[i]);
                found = true;
                break;
            }
            set.add(arr[i]);
        }
        if (!found) {
            System.out.println("No Pair Found");
        }
        sc.close();
    }
}
