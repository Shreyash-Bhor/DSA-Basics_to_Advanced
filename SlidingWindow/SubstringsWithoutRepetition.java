package SlidingWindow;

import java.util.*;

public class SubstringsWithoutRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();

        int start = 0;
        int count = 0;

        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            count += (end - start + 1);
        }
        System.out.println(count);
        sc.close();
    }
}
