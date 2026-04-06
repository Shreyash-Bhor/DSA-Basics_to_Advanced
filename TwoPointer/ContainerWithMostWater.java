package TwoPointer;

import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        int maxWater = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            System.out.println("height: " + h);
            int width = right - left;
            System.out.println("Width: " + width);
            int area = h * width;
            System.out.println("Area: " + area);

            maxWater = Math.max(maxWater, area);
            System.out.println("MaxWater: " + maxWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxWater);
        sc.close();
    }
}
