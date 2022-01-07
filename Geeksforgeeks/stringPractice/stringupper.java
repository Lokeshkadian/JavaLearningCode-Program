package stringPractice;

public class stringupper {

    static String Compute(String s, int n) {

        String name;
        name = s.toLowerCase();
        System.out.println(name);
        return name;
    }

    static String modify(String s) {
        String name;
        char a = s.charAt(0);
        if (a >= 65 && a <= 91) {
            name = s.toUpperCase();
        } else
            name = s.toLowerCase();

        System.out.println(name);
        return name;

    }

    static String conRevstr(String s, String s2) {

        String s3 = s.concat(s2);
        // System.out.println(s3);
        int n = s3.length();
        System.out.println(n);
        String s4 = "";
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(s3.charAt(i));
            // s4 += s3.charAt(i);
        }

        return s4;
    }

    public static void main(String[] args) {

        String s = "lOKESH";
        modify(s);
        // String s2 = "dJdIqNpQs";
        // // Compute(s, 9);
        // conRevstr(s, s2);
        // // System.out.println(s3);
    }

}
