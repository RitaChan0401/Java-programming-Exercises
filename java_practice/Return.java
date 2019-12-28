package java_practice;

public class Return {
    public static void print() {  // void型なので戻り値を返さない
        System.out.println("It all returns to nothing");
    }
    public static int add(int x) {
        int result = x + 1999;
        return result;  // return文でresultの値を返す。
    }

    public static void main(String[] args) {
        int result = add(1); // 分かりやすくするためにreturnによって戻される値と同じ型で変数を指定
        print(); // 「It all returns to nothing」と出力
        System.out.println(result); // 「2000」と出力
    }
}
