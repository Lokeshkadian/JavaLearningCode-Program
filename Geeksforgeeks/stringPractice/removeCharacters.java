package stringPractice;

public class removeCharacters {

    static String removeChar(String string1, String string2) {

        if (string1.length() > string2.length()) {
            String a = "";
            for (int i = 0; i < string1.length(); i++) {
                a = "" + string1.charAt(i);
                if (string2.contains(a)) {
                    continue;
                } else {
                    System.out.print(string1.charAt(i));
                }
            }
        } else {
            System.out.println("fist string is smaller than other");
        }
        return string2;

    }

    public static void main(String[] args) {
        String string1 = "compass";
        String string2 = "campus";
        removeChar(string1, string2);
    }
}
