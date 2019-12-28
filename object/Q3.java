package object;

public class Q3 {
    public static void main(String[] args) {
        Casket casket1 = new Casket();
        casket1.setOne(new Jewel("金"));
        casket1.setTwo(new Jewel("土"));

        casket1.accept(new CVisitor3());
    }
}
