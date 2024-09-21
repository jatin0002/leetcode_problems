package org.jatin.arrays.oneD;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int area = 0;

        while (i < j) {
            int h1 = height[i];
            int h2 = height[j];
            int _h = Math.min(h1, h2);
            int _w = Math.abs(i - j);
            area = Math.max(area, _h * _w);

            if (h1 < h2) {
                i++;
            } else {
                j--;
            }
        }

        return area;

    }
}
