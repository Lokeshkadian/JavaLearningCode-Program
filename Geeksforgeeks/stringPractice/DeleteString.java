package stringPractice;

public class DeleteString {

    static String delAlternate(String S) {
        int n = S.length();
        String str = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str += S.charAt(i);
            }
        }
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        String S = "lokesh";
        delAlternate(S);
    }
}
