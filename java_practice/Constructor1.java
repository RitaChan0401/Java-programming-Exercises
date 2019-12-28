public class Constructor1{
    String name = "青山 ブルーマウンテン";

    public Constructor1(){
        System.out.println(name);
    }
}
class Main2{
    public static void main(String[] args) {
        Constructor1 cs = new Constructor1();
    }
}