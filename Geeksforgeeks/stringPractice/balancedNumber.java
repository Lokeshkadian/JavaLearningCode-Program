package stringPractice;

public class balancedNumber {
    static boolean balancedNum(String N) {

        int n = N.length();
        int c = n / 2;
        int a = 0;
        int b = 0;
        for (int i = 0; i < c; i++) {
            a = a + (int) (N.charAt(i));
        }
        for (int i = c + 1; i < n; i++) {
            b = b + (int) (N.charAt(i));
        }
        if (a == b) {
            System.out.println(true);
            return true;

        } else
            System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        String N = "1234006";
        balancedNum(N);
    }

}
