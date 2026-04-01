package HashMap;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (set.contains(num)) {
                duplicate = true;
            }
            set.add(num);
        }
        if (duplicate) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
