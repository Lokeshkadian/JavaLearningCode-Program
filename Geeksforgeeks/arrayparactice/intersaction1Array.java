package arrayparactice;

import java.util.Arrays;

public class intersaction1Array {
    public static void inter1Array(int a[], int b[]) {
        int i = 0;
        int j = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (i < a.length) {

            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print("we got the answer " + a[i]);
                i++;
                System.out.println("");
            }

        }
    }

    public static void main(String[] args) {
        // int a[] = { 1, 3, 4, 7 };
        // int b[] = { 2, 4, 7, 8 };
        int a[] = { 1, 2, 3, 10, 17 };
        int b[] = { 9, 8, 7, 6, 17, 8, 5, 4, 3, 2, 1 };
        inter1Array(a, b);
    }
}
