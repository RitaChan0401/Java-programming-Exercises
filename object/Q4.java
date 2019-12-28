package object;

public class Q4 {
    public static void main(String[] args) {
        Casket casket1 = new Casket();
        Casket casket2 = new Casket();
        Casket casket3 = new Casket();
        casket1.setOne(casket2);
        casket1.setTwo(new Jewel("月"));
        casket2.setOne(casket3);
        casket2.setTwo(new Jewel("火"));
        casket3.setOne(new Jewel("水"));
        casket1.accept(new CVisitor3());
    }
}
