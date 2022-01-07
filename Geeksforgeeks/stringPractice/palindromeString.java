package stringPractice;

public class palindromeString {
    static int isPalingrome(String S) {
        String a = "";
        int n = S.length();
        for (int i = n - 1; i >= 0; i--) {
            a += S.charAt(i);
        }
        if (S.equals(a)) {
            System.out.println("Yes, String is palindrome");
            return 1;
        } else
            System.out.println("No, String is not palindrome");
        return 0;

    }

    public static void main(String[] args) {

        String S = "lokesh";
        isPalingrome(S);

    }

}
