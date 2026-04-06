package TwoPointer;

import java.util.*;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                result[k--] = leftSq;
                left++;
            } else {
                result[k--] = rightSq;
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
