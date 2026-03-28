package Fundamentals.Arrays;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Frequency array
        int[] freq = new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // 1. Count Frequency
        System.out.println("Frequency of elements:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
        // 2. Duplicate Elements
        System.out.println("Duplicate Elements:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 3. First Non-Repeating ELement
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 1) {
                System.out.println("First Non-Repeating Element: " + arr[i]);
                break;
            }
        }
        // 4. Most Frequent Element
        int maxFreq = 0;
        int mostFrequent = -1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = i;
            }
        }
        System.out.println("Most Frequent Element: " + mostFrequent);

        // 5. Least Frequent Element
        int minFreq = Integer.MAX_VALUE;
        int leastFrequent = -1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                leastFrequent = i;
            }
        }
        System.out.println("Least Frequent Element: " + leastFrequent);

        // 6. Elements Occuring Once
        System.out.println("Elements Occuring Once: ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 7. Elements Occuring Odd Number of times
        System.out.println("Elements occuring odd number of times: ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
