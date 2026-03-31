package Fundamentals.Numbers;

import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Decimal to Binary
        int binary = 0;
        int place = 1;
        while (n > 0) {
            int digit = n % 2;
            binary = binary + digit * place;
            place = place * 10;
            n = n / 2;
        }
        System.out.println(binary);

        // Binary to Decimal
        int n1 = sc.nextInt();
        int decimal = 0;
        int base = 1;
        while (n1 > 0) {
            int rem = n1 % 10;
            System.out.println("Decimal = " + decimal + " + " + rem + " * " + base);
            decimal = decimal + rem * base;
            System.out.println("Decimal: " + decimal);
            base = base * 2;
            n1 = n1 / 10;
        }
        System.out.println("decimal: " + decimal);

        sc.close();
    }
}
