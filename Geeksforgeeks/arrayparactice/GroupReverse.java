// numbers will reverse in group of two. 
package arrayparactice;

public class GroupReverse {
    public static void GroupRev(int a[], int s, int k) {
        int b[] = new int[s];
        int p = 0;
        int c = 0;
        for (int i = k - 1; i >= 0; i--) {
            b[p] = a[i];
            p++;
            c = p;
        }
        for (int j = s - 1; j >= k; j--) {
            b[c] = a[j];
            c++;
        }
        for (int i = 0; i < s; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int s = a.length;
        int k = 3;// this is group decide point.
        GroupRev(a, s, k);
    }
}
