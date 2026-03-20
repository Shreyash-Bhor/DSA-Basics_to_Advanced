package Arrays;

import java.util.*;

public class ElementOccuringOddTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("result: " + result);
            System.out.println("arr[i]: " + arr[i]);
            result ^= arr[i];
        }
        System.out.println(result);
        sc.close();
    }
}