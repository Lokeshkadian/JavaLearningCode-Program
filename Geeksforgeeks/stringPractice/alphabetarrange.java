package stringPractice;

public class alphabetarrange {
    public static void caseSort(String str) {
        int a = str.length();
        char min;
        char b;
        // char s;
        min = str.charAt(0);
        for (int i = 0; i < a; i++) {
            b = str.charAt(i);
            if (min > b) {
                min += b;
                System.out.println(min);
            }

        }
        // s = min;
        System.out.print(min);

    }

    public static void main(String[] args) {
        String str = "acdb";
        caseSort(str);
    }

}
