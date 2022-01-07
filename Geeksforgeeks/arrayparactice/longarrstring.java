package arrayparactice;

public class longarrstring {

    static String longest(String name[], int n) {

        n = name.length;
        int max = 0;
        int a = 0;
        int in = 0;

        for (int i = 0; i < n; i++) {
            a = name[i].length();
            if (max < a) {
                max = a;
                in = i;
            }
        }
        String s = name[in];
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {

        System.out.println("Print the longest string from array of string : ");
        String name[] = { "lok", "loke", "lokes", "ram prasad mishra" };
        longest(name, 8);
    }
}