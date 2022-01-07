package stringPractice;

public class checkProgram {
    public static boolean checkPangram(String str) {
        int x = 0;
        String a = "";
        boolean isright = false;

        for (int i = 0; i < str.length(); i++) {
            String temp = "" + str.charAt(i);
            x = (int) str.charAt(i);
            if (65 <= x && x <= 123) {
                if (a.contains(temp)) {
                    continue;
                } else {
                    a = a + "" + str.charAt(i);
                }
            } else {
                continue;
            }
            if (a.length() == 26) {
                System.out.println(a);
                isright = true;
            }
        }
        System.out.println(isright);
        return isright;
    }

    public static void main(String[] args) {

        String str = "qazwsxedcrfvtgbyhnujmikolpppp";
        checkPangram(str);

    }
}
