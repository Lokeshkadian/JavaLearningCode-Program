
public class largestarra {

    public static void main(String[] args) {
        int arr[] = { 1, 8, 60, 100, 101 };
        int n = 5;

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

}

// class Compute {
// public int largest(int arr[], int n) {
// int max = arr[0];
// for (int i = 0; i < n; i++) {
// if (arr[i] > max) {
// int temp = arr[i];
// arr[i] = max;
// max = temp;
// }
// }
// return max;
// }

// int main() {

// int n = 5;
// int arr[] = { 7, 89, 90, 55, 66 };
// Compute l = new Compute();
// l.largest(arr, n);
// return 0;
// }

// }
