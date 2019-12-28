package dataformat;

import java.util.ArrayList;

public class FT1_8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("c");
        list.add("d");
        list.add(1,","); //1番目に「,」を追加
        String q16 = String.join("" , list);
        System.out.println(q16); //c,d
    }
}
