package Fundamentals.Arrays;

import java.util.*;

public class MergeUnsorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // No sorting. Merge first and second array into new array.
        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }
        System.out.print("Merged UnSorted Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
