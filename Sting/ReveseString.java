public class ReveseString {
    public static void main(String[] args) {

        String a1 = "    hello my name is loke    sh   ";
        String a = a1.trim();
        String b[] = a.split("");

        int n = b.length;
        // var c = " ";
        System.out.println(n);

        for (int i = n - 1; i >= 0; i--) {
            if (b[i] == " ") {
                System.out.println("Hello");
                break;

            } else
                System.out.print(b[i]);
        }
    }

}
