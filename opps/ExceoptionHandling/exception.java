package ExceoptionHandling;

public class exception {

    public void Sum(int a, int b) throws ArithmeticException {
        // try {
        // z = a / b;
        // } catch (ArithmeticException e) {
        // System.out.println("denomenetor is should not be zero ");
        // b = 44;
        // }
        System.out.println("this is the sum method");
    }

    public static void main(String[] args) {
        exception e = new exception();
        // int a = 0;
        // int b = 0;
        // int c = 0;
        try {
            e.Sum(44, 0);
        } catch (ArithmeticException w) {
            int c = 9;
            int v = 9;
            int g = c + v;
            System.out.println(g);
        }
        // System.out.println(c);
    }
}
