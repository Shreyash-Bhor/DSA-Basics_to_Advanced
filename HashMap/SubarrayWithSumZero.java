package HashMap;

import java.util.*;

public class SubarrayWithSumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (set.contains(sum) || sum == 0) {
                found = true;
                break;
            }
            set.add(sum);
        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}