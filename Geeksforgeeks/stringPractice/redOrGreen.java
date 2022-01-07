package stringPractice;

public class redOrGreen {
    static int Redgreen(String name, int n) {
        n = name.length();
        int R = 0;
        int G = 0;
        char s;
        s = name.charAt(0);
        for (int i = 0; i < n; i++) {
            if (s == name.charAt(i)) {
                R++;
            } else
                G++;
        }
        if (R > G) {
            System.out.println(G);
        } else {
            System.out.println(R);
        }
        return R > G ? G : R;
    }

    public static void main(String[] args) {

        String name = "GRR";
        Redgreen(name, 9);
    }
}
