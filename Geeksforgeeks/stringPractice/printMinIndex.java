package stringPractice;

public class printMinIndex {
    public static void printMinIndexChar(String S, String patt) {

        int n = patt.length();

        for (int i = 0; i < n; i++) {
            char a = patt.charAt(i);
            if (a == S.charAt(i)) {
                System.out.print(a);
                break;
            } else if (i == n - 1) {
                System.out.println("$");
            }
        }
    }

    public static void main(String[] args) {

        String S = "vxhpddqhoa";
        String patt = "ofdqnlkrsc";
        printMinIndexChar(S, patt);
    }

}
