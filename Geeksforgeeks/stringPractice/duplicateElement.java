package stringPractice;

public class duplicateElement {
    public static void duplicateElemt(String s) {
        int n = s.length();
        String a = "";
        for (int i = 0; i < n; i++) {
            String temp = "" + s.charAt(i);
            if (a.contains(temp)) {
                continue;
            } else {
                a += s.charAt(i);
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {

        String s = "lokkoleshsh";
        duplicateElemt(s);
    }

}
