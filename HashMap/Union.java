package HashMap;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            set.add(sc.nextInt());
        }

        for (int num : set) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
