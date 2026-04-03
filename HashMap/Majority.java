package HashMap;

import java.util.*;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = -1;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                majority = num;
            }
        }
        if (majority != -1) {
            System.out.println("Majority: " + majority);
        } else {
            System.out.println("No Majority");
        }
        sc.close();
    }
}
