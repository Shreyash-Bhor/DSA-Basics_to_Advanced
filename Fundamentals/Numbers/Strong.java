package Fundamentals.Numbers;

import java.util.*;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            sum = sum + factorial;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
        sc.close();
    }
}
