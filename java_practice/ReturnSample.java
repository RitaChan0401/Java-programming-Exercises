import java.util.Scanner;

public class ReturnSample{
    public static String Judgment(int n){
        if (n % 2 == 0){
            return "偶数";
        }else{
            return "奇数";
        }
    }
    public static void main(String[] args){
        String result;
        System.out.print("数値を入力してください:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        result = Judgment(number);
        System.out.println(result);
    }
}