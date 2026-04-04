package PrefixSum;

import java.util.*;

public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print sum of index from L -> R for given number of queries.
        System.out.println("Enter Number of Queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter L and R: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l == 0) {
                System.out.println(prefix[r]);
            } else {
                System.out.println(prefix[r] - prefix[l - 1]);
            }
        }
        sc.close();
    }
}
