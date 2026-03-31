package HashMap;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        sc.close();
    }
}
