package Fundamentals.Strings;

import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (String word : words) {
            char[] arr = word.toCharArray();
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            System.out.print(new String(arr) + " ");
        }
        sc.close();
    }
}
