public class String1 {
    public static void main(String[] args) {

        String name = "lokesh kumar";
        String name2 = new String("lokesh kumar");
        String name12 = "       lokesh kumar        ";

        System.out.println(name12.trim());
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

    }

}
