package opps;

public class myContructor {
    int a;

    myContructor(int a) {
        this.a = a;
        System.out.println(a);
    }

    public static void main(String[] args) {

        myContructor c = new myContructor(90);
        c.a = 88;

    }

}
