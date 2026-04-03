package HashMap;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            int num = sc.nextInt();
            set.add(num);
        }

        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i = 0; i < n2; i++) {
            int num = sc.nextInt();
            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        sc.close();

    }
}
