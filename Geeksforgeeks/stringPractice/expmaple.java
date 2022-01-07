package stringPractice;

public class expmaple {
    static String readString(String s, int n) {
        String x = " , ,ABCabc,DEFdef,GHIghi,JKLjkl,MNOmno,PQRSpqrs,TUVtuv,WXYZwxyz";
        String[] a = x.split(",");
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[j].length(); k++) {
                    if (b == a[j].charAt(k)) {
                        ans += "" + j;
                    }
                }
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s = "geeksquiz";
        int n = 0;
        readString(s, n);
    }

}
