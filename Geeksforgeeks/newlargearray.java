
public class newlargearray {
    public void large(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 1, 2, 3, 45, 7, 902 };
        newlargearray l = new newlargearray();
        l.large(arr, n);
    }
}
