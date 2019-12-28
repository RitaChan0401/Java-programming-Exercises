package object;

public class Q2 {
    public static void main(String[] args) {

    Jewel letter0 = new Jewel("月");
    Jewel letter1 = new Jewel("火");

    letter0.accept(new CVisitor2());
    letter1.accept(new CVisitor2());
    }
}
