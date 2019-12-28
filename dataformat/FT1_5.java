package dataformat;

import java.util.Arrays;

public class FT1_5 {
    public static void main(String[] args) {
        String q8 = FT1_4.join("a" , "b"); //12行目のjoinメソッドへ
        String q9 = FT1_4.join(Arrays.asList("a" , "b")); //9行目のjoinメソッドへ
        String q10 = FT1_4.join();
        String q11 = FT1_4.r1(2 , "a");
        String q12 = FT1_4.r2("cd");
        String q13 = FT1_4.join(new Line());
        System.out.println(q8); // a.b
        System.out.println(q9); // a,b
        System.out.println(q10); //
        System.out.println(q11); // aa
        System.out.println(q12); // dc
        System.out.println(q13); // c,d
    }
}
