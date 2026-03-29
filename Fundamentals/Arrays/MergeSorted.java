package Fundamentals.Arrays;

import java.util.Scanner;

public class MergeSorted {
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
        // With sorting. Using two pointer.
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        System.out.print("Merged Sorted Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
