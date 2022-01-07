// Sequence of the array's elements. 011222
package arrayparactice;

public class Sequence {
    public static void seqArray(int a[], int n) {
        int x[] = new int[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < 3) {
                    if (a[j] == i) {
                        x[p] = a[j];
                        p++;
                    }
                }
            }
            System.out.print(x[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 0, 2, 0, 2, 1 };
        int n = a.length;
        seqArray(a, n);
    }
}
