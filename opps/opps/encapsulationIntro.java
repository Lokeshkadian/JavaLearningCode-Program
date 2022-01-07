package opps;

import opps.modes.student;

public class encapsulationIntro {

    public static void main(String[] args) {

        student s = new student();
        s.name = "Lokesh kumar";
        s.roll = 21;
        System.out.println(s.name + " " + s.roll + " ");
        s.getPhone(901385575);
    }

}
