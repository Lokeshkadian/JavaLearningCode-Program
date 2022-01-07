package arrayparactice;

public class circulararr {

    public static void circullararray(int a[], int n) {
        n = a.length;
        System.out.print("Circullar array is:- ");
        for (int i = 0; i <= n - 1; i++) {
            int temp = a[n - 1];
            a[n - 1] = a[i];
            a[i] = temp;
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 3, 4, 5, 6 };
        circullararray(arr, 7);
    }

}
