package arrayparactice;

public class arraySort {
    public static void threeSort(int a[], int n) {
        int b[] = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x == a[j]) {
                    b[i] = a[j];
                    System.out.print(b[i]);
                } else {
                    j++;
                }
            }
            x++;
            if (x < n) {
                continue;
            }
        }
        // for (int i = 0; i < n; i++) {
        // System.out.print(b[i]);
        // }
    }

    public static void main(String[] args) {
        int a[] = { 0, 1, 2, 0, 1, 0, 2, 0 };
        int n = a.length;
        threeSort(a, n);
    }

}
