package stringPractice;

public class subsequence {
    static int commonSubseq(String S1, String S2) {
        int n = 0;
        int x = 0;
        for (int i = 0; i < S1.length(); i++) {
            for (int j = 0; j < S2.length(); j++) {
                char a = S1.charAt(i);
                if (a == S2.charAt(j)) {
                    n = (int) S2.charAt(j);
                } else
                    continue;
            }
        }
        if (n > 0) {
            x++;
            System.out.print(x + " ISsubsequence is true");
        } else
            System.out.print(x + " ISsubsequence is False");
        return x;
    }

    public static void main(String[] args) {
        String S1 = "JAMTARA";
        String S2 = "Kkkkkkk";
        commonSubseq(S1, S2);
    }
}
