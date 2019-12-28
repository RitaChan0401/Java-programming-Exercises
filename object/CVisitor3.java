package object;

public class CVisitor3 implements Visitor {
    public void visit(Casket casket){
        System.out.print("箱");

        Acceptable acceptable1 = casket.getOne();
        Acceptable acceptable2 = casket.getTwo();

        if (acceptable1 != null){
            acceptable1.accept(this);
        }
        if (acceptable2 != null){
            acceptable2.accept(this);
        }
    }

    public void visit(Jewel jewel){
        System.out.println(jewel.toString());
    }
//    public void visit(Ring ring){
//
//    }
}
