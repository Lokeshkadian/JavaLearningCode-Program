package opps.modes;

public class student {
    public String name;
    public int roll;
    int n = 10;

    public int getPhone(int phone) {
        if (phone <= n) {
            System.out.println("Enter the valid mobile number: ");
        }
        System.out.println(phone);
        return phone;
    }

    public void setPhone(int phone) {
    }

}
