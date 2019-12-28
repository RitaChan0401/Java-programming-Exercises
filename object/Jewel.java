package object;

public class Jewel implements Acceptable {
    private String s; //インスタンス変数

    public Jewel(String s){
        this.s = s;
    }
    public String toString(){
        return this.s;
    }
    public void accept (Visitor visitor){
        visitor.visit(this);
    }
}
