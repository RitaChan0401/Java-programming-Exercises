package dataformat;

import java.util.Collections;
import java.util.List;

public class FT1_4 {
    public static final String DELIMITER1 = ",";
    public static final String DELIMITER2 = ".";
    public static final String DELIMITER3 = "";

    public static String join(Iterable<? extends CharSequence> elements){
        return String.join(DELIMITER1 , elements);
    }
    public static String join(CharSequence... elements){
        return String.join(DELIMITER2 , elements);
    }

    // import java.util.Collections;はここで使用している。
    public static String r1 (int n , String s){

        //「nCopies」は指定されたオブジェクトのn個のコピーで構成される不変のリストを返します。
        //nは返されるリストの要素数
        //sは返されるリストに繰返し現れる要素。
        List<String> list = Collections.nCopies(n,s);
        return String.join(DELIMITER3 , list);
    }
    public static String r2 (String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
