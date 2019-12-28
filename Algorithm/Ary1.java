package Algorithm;

public class Ary1 {
    public static void main(String[] args) {
        int[] a = new int[5];

        for(int i = 0; i < a.length; i++)
            a[i] = i;

        System.out.println("a[3] : " +a[3]);


        //int[] b = a;
        int[] b = (int[]) a.clone();
        b[3] = 200;

        System.out.println("a[3] : " +a[3]);
        System.out.println("b[3] : " +b[3]);
    }
}
