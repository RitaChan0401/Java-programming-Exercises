package object;

public class CVisitor1 implements Visitor {
    public void visit(Casket casket){
        System.out.println("水");
    }
    public void visit(Jewel jewel){
        System.out.println("木");
    }
//    public void visit(Ring ring){
//        System.out.println("");
//    }
}
