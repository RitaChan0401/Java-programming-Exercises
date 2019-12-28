package Algorithm;

import Algorithm.BinarySearch2;

public class D2_BS2 {
    public static void main(String[] args) {
        BinarySearch2 bs2 = new BinarySearch2();
        bs2.add(1 , "one");
        bs2.add(3 , "three");
        bs2.add(4 , "four");
        bs2.add(8 , "eight");
        bs2.add(13 , "thirteen");
        bs2.add(14 , "fourteen");
        bs2.add(18 , "eighteen");
        bs2.add(20 , "twenty");
        bs2.add(21 , "twenty one");
        bs2.add(25 , "twenty five");

        System.out.println(bs2.search(14));
    }
}
