package object;

public class CVisitor2 implements Visitor{
    public void visit(Casket casket){
        System.out.println("水");
    }
    public void visit(Jewel jewel){
        System.out.println(jewel.toString());
    }
//    public void visit(Ring ring){
//        System.out.println(ring.toString());
//    }
}
