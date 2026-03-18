package Numbers;

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    sum += i;
                }
                int pair = n / i;
                if (pair != i && pair != n) {
                    sum += pair;
                }
            }
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
        sc.close();
    }
}
