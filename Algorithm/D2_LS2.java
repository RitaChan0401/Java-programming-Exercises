package Algorithm;

public class D2_LS2 {
    public static void main(String[] args) {
        LinearSearch2 ls2 = new LinearSearch2();
        ls2.add(1, "one");
        ls2.add(10, "ten");
        ls2.add(2, "two");
        System.out.println(ls2.search(10));
    }
}

