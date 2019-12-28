package java_practice;

public class Constructor2{
    public Constructor2(String str){
        System.out.println(str);
    }
}
class Main{
    public static void main(String[] args){
        Constructor2 A = new Constructor2("Hello");
    }
}