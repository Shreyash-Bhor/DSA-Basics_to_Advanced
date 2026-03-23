package Fundamentals.Arrays;

import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];

            }
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Second max: " + secondMax);
        System.out.println("Second min: " + secondMin);
        sc.close();
    }
}
