package Fundamentals.Numbers;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        // Armstrong number = sum of digits raised to power of number of digits
        // 153 = 1^3 + 5^3 + 3^3 = 153

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            System.out.println("rem: " + rem);
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power = power * rem;
            }
            sum = sum + power;
            n /= 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
