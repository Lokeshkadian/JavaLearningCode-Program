public class anagram1 {

    public static void main(String[] args) {

        String a = "loeh";
        String b = "esok";
        boolean visited[] = new boolean[b.length()];
        boolean isAnagram = false;

        if (a.length() == b.length()) {

            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);

                for (int j = 0; j < b.length(); j++) {

                    if (b.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        // System.out.println(j);
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if (isAnagram) {
            System.out.println("Anagram:");
        } else
            System.out.println("Not Anagram: ");
    }
}
