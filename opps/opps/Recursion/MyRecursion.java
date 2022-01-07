package opps.Recursion;

public class MyRecursion {
    static int x = 0;

    public static int Factorial(int a) {
        if (a < 1) {
            return 1;
        } else
            x = a * Factorial(a - 1);
        return x;
    }

    public static int NaturalNumberSum(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a + NaturalNumberSum(a - 1);
        }
    }

    public static int MatrixPath(int a, int b) {
        if (a == 1 || b == 1) {
            return 1;
        } else
            return MatrixPath(a - 1, b) + MatrixPath(a, b - 1);
    }

    public static int Power(int a, int b) {
        if (b == 0) {
            return 1;
        } else
            return a * Power(a, b - 1);
    }

    public static int PowerFast(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return PowerFast(a * a, b / 2);
        } else
            return a * PowerFast(a, b - 1);
    }

    public static int Fibbonaci(int n) {
        if (n <= 1) {
            return n;
        } else
            return Fibbonaci(n - 1) + Fibbonaci(n - 2);
    }

    public static void main(String[] args) {
        int a = 2;
        // int b = Factorial(a);
        // System.out.print("Factorial of " + a + " is " + b + " ");

        // int b = NaturalNumberSum(a);
        // System.out.print("NatualSum of " + a + " is " + b + " ");

        int b = 5;
        // System.out.println(MatrixPath(a, b));
        // System.out.println(Power(a, b));

        // System.out.println(PowerFast(a, b));
        System.out.println(Fibbonaci(5));

    }

}
