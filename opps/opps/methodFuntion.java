package opps;

public class methodFuntion {

    // static int add(int a, int b) {
    // var sum = a + b;
    // return sum;
    // }
    // PASS BY VALUE

    static void show(int a) {

        System.out.println(a);
    }

    public static void main(String[] args) {
        // int x = 10;
        // int y = 20;

        // int sum = add(10, 60);
        // // add(0, 90);
        // System.out.println(sum);
        // int x = 90;

        // PASS BY VALUE

        int a = 90;
        System.out.println(a);
        show(88);
    }

}
