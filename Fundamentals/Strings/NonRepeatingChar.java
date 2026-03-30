package Fundamentals.Strings;

import java.util.*;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println(str.charAt(i));
                return;
            }
        }
        System.out.println("No non repeating character");
    }
}
