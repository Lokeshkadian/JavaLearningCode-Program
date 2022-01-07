import java.util.Arrays;

public class twoPointerAlgo {
    public static boolean findSum(int a[], int x) {
        Arrays.sort(a);
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] + a[j] < x) {
                i++;
            } else if (a[i] + a[j] > x) {
                j--;
            } else {
                System.out.println("true " + a[j] + " " + a[i] + " ");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, -1, 3, -4, 0, 3 };
        int x = 7;
        findSum(a, x);
    }

}
