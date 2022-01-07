package arrayparactice;

public class addarr {

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = 3;
        int b[] = { 63, 18, 65 };
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j <= i; j++) {
                sum += a[i][j];
            }
        }
        int max = b[0];
        System.out.print(sum + ",");
        for (int j = 0; j < n - 1; j++) {

            if (max <= b[j + 1]) {
                int temp = max;
                max = b[j + 1];
                b[j + 1] = temp;
            }
        }
        System.out.println(max);
    }
}
