package arrayparactice;

public class wavearr {
    static void wavearray(int a[], int n) {
        n = a.length;

        for (int i = 0; i < n - 1; i++) {

            if (a[i] < a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
            System.out.print(" " + a[i] + " ");
            i++;
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6 };
        wavearray(a, 8);
    }

}
