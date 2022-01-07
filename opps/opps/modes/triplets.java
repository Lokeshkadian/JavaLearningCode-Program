package opps.modes;

import java.util.Arrays;

public class triplets {
    public static boolean findTriplets(int a[], int x, int n) {
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {
            if (findSum(a, -a[i], i + 1, n)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findSum(int a[], int x, int i, int n) {
        // int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] + a[j] < x) {
                i++;
            } else if (a[i] + a[j] > x) {
                j--;
            } else {
                System.out.println("true " + x + " " + a[i] + " " + a[j] + " ");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, -1, 3, -4, 0, 3 };
        int x = 0;
        int n = a.length;
        findTriplets(a, x, n);
    }
}