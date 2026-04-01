package HashMap;

import java.util.*;

public class RepeatingElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
