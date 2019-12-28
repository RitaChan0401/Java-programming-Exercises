package object;

public class Casket implements Acceptable{
    private Acceptable one = null;
    private Acceptable two = null;

    public Acceptable getOne(){
        return this.one;
    }
    public Acceptable getTwo(){
        return this.two;
    }
    public void setOne(Acceptable one){
        this.one = one;
    }
    public void setTwo(Acceptable two){
        this.two = two;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
