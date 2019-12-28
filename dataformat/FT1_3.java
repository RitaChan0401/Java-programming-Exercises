package dataformat;

import java.util.Arrays;

public class FT1_3 {
    public static void main(String[] args) {
        String a = "c";
        String b = "d";
        String q5 = String.join("," , "a" , "b");
        String q6 = String.join("," , Arrays.asList("a" , "b"));
        String q7 = String.join(",");
        System.out.println(q5);
        System.out.println(q6);
        System.out.println(q7);
    }
}
