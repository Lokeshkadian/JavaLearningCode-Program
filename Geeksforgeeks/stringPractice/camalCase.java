package stringPractice;

public class camalCase {
    static int countCamelCase(String s) {
        int count = 0;
        int a = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            a = (int) s.charAt(i);
            if (a >= 65 && a <= 91) {
                count++;
                System.out.print(s.charAt(i));
                System.out.println();
            }

        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String s = "LokeshKumarIsAwesomePerson";
        countCamelCase(s);
    }
}
