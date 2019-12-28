package object;

public class Q1 {
    public static void main(String[] args) {
        Jewel letter0 = new Jewel("");
        Jewel letter1 = new Jewel("");

        letter0.accept(new CVisitor1());
        letter1.accept(new CVisitor1());
    }
}
