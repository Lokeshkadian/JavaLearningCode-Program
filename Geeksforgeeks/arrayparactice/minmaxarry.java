package arrayparactice;

public class minmaxarry {

    static void minarraymax(int a[], int n) {
        n = a.length;

        int max = a[0];
        int min = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                int temp = max;
                max = a[i];
                a[i] = temp;
            }
        }
        System.out.println("Maximum number od an aary: " + max);
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                int temp = min;
                min = a[i];
                a[i] = temp;
            }
        }
        System.out.println("Minimum number od an aary: " + min);
    }

    public static void main(String[] args) {

        int arr[] = { 101, 1, 2, 3, 4, 5, 908, -5, 907 };
        minarraymax(arr, 5);
    }
}
