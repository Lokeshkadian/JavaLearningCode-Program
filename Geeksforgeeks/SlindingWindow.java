import java.util.Deque;
import java.util.LinkedList;

public class SlindingWindow {

    public int[] Sliding(int a[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[n - k + 1];
        if (n == 0) {
            return a;
        }

        int i = 0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (; i < n; i++) {

            ans[i - k] = a[dq.peekFirst()];

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i - k] = a[dq.peekFirst()];

        return ans;

    }

    public static void main(String[] args) {
        SlindingWindow slide = new SlindingWindow();

        int a[] = { 2, 3, 1, 5, 7, 1, 2, 5, 4, 3 };
        int n = a.length;

        int ans[] = slide.Sliding(a, n, 3);

        for (int p : ans) {
            System.out.print(p + " ");
        }
    }

}
