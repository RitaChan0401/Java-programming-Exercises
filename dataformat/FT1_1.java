package dataformat;

public class FT1_1 {
    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        int c = 1;
        int d = 2;
        String q1 = a + b;
        String q2 = "" + c + d;
        System.out.println(q1); // 12
        System.out.println(q2); // 12
        System.out.println(c + d); // 3
    }
}
