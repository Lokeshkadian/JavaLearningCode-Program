package opps.Interfaces;

public class carclass implements Intercar {

    @Override
    public void Wheels() {
        System.out.println("Wheels are 4 and 1 is extra");

    }

    @Override
    public void Doors() {
        System.out.println("Doors are 4");

    }

    @Override
    public void engine() {
        System.out.println("This car has 1.2l engine");
    }

    @Override
    public void seater() {
        System.out.println("This car has 4+1 seates");
    }

    @Override
    public void company_name() {
        System.out.println("Sorry company name can not be disclose yet");

    }

    @Override
    public void milage() {
        System.out.println("This car has 18 kmpl");

    }

    public static void main(String[] args) {
        carclass c = new carclass();
        c.company_name();
        c.Doors();
        c.Wheels();
        c.engine();
        c.milage();

    }
}
