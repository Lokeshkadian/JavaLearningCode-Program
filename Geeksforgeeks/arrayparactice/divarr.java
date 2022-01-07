package arrayparactice;

public class divarr {
    static int divarray(int a[], int n) {
        n = a.length;
        int n1 = n / 2;

        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < n1; i++) {
            sum += a[i];
        }
        for (int i = n1; i <= n - 1; i++) {
            sum1 += a[i];
        }
        int result = sum * sum1;
        System.out.println(sum + " " + sum1 + " result is: " + result);
        return result;
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4 };
        divarray(a, 7);
    }

}
