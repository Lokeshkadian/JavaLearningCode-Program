package stringPractice;

public class closingBaracket {
    static int closing(String s, int pos) {
        int n = s.length();
        char a = '[';
        char b = ']';
        int count = 0;

        for (int i = pos; i < n; i++) {
            if (a == s.charAt(i)) {
                count++;
            }
            if (b == s.charAt(i)) {
                count--;
            }
            if (count == 0) {
                System.out.println(i);
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int pos;
        String s = "[[][][][][][]]";
        closing(s, 0);

    }

}
