package stringPractice;

public class deleteElement {

    static String modify(String S) {
        String a[] = S.split(" ");
        String b = "";
        for (int i = 0; i < a.length; i++) {
            b += a[i];
        }
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        String S = "l oke esg";
        modify(S);
    }

}
