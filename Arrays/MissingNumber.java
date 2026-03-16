package Arrays;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        int total = n * (n + 1) / 2; // formula for sum of first N natural numbers
        int missing = total - sum;
        System.out.println(missing);
        sc.close();
    }
}
