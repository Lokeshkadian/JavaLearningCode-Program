package stringPractice;

public class firstAlphabet {
    static String firstAlpha(String S) {
        String b = "";
        String[] a = S.split(" ");
        for (int i = 0; i < a.length; i++) {
            int j = 0;

            b += a[i].charAt(j);
        }
        return b;
    }

    public static void main(String[] args) {

        String S = "bad is good";
        firstAlpha(S);
    }

}
