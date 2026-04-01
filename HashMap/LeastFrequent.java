package HashMap;

import java.util.*;

public class LeastFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int leastFreq = n + 1;
        ;
        int result = -1;

        for (int num : map.keySet()) {
            if (map.get(num) < leastFreq) {
                leastFreq = map.get(num);
                result = num;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
