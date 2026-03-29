package Fundamentals.Arrays;

import java.util.*;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Remove Duplicates from array using two pointers
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        int newLength = i + 1;
        System.out.println("New Length: " + newLength);
        System.out.print("Array: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
