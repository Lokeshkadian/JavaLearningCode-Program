package opps;

public class dog {
    int legs;

    static void swap(dog a, dog b) {
        dog temp = a;
        a = b;
        b = temp;
        System.out.println("a " + a.legs + " b " + b.legs);
    }

    static void changeValue(dog a) {
        a.legs = 5;
    }

    public static void main(String[] args) {

        dog d = new dog();
        d.legs = 2;
        dog c = new dog();
        c.legs = 4;

        swap(d, c);
        System.out.println("a " + d.legs + " b " + c.legs);

        changeValue(d);
        System.out.println(d.legs);

    }
}
