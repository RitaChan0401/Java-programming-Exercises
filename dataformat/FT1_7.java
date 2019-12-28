package dataformat;

import java.nio.charset.Charset;

public class FT1_7 {
    public static final Charset CHARSET = Charset.forName("Windows-31J");

    public static void main(String[] args) {

        // byteの使いどころはデータをバイナリで扱う時
        byte [] temp = "ab".getBytes(CHARSET);
        for (int i = 0; i < temp.length; i++){
            temp[i] = ++temp[i]; //バイナリに変換されたabが1ずつズレる→bcに
            temp[i] = ++temp[i]; //さらに1ずつズレる→cdに
        }
        String q15 = new String(temp , CHARSET);
        System.out.println(q15);
    }
}
