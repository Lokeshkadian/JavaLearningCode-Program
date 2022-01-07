package arrayparactice;

public class intersectionArray {
    public static void interArray(int a[], int b[]) {
        int i = 0;
        int j = 0;
        while (i < a.length) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                j = 0;
                i++;
            } else if (j == b.length - 1) {
                j = 0;
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 10, 17 };
        int b[] = { 9, 8, 7, 6, 17, 8, 5, 4, 3, 2, 1 };
        interArray(a, b);
    }
}
