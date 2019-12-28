package dataformat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FT1_2 {
    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("1" , "2"); // 可変長リスト。インスタンス化した時、~.addで動的に値を追加できる。
        String [] s2 = {"1" , "2"}; //　簡単ではあるがインスタンス化した時、固定長リストのため要素が増えたたびに格納数も増やしてあげないといけない。
        String q3 = join(s1);
        String q4 = join(s2);
        System.out.println(q3);
        System.out.println(q4);
    }
    public static String join(Collection<String> c){
        String temp = "d";
        // 拡張for文は、配列やListなどのコレクションのすべての要素に対して順番に処理を行うために使う。
        for (String s:c){
            temp = temp + s + ","; // 1回目d1, | 2回目d1,2, → tempにd1,が入った状態で2,が追加
        }
        return temp;
    }
    public static String join(String ... s){
        // joinメソッドを使用して、文字列を連結できる
        return String.join("," , s);
    }
}
