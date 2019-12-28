package dataformat;

public class FT1_6 {
    public static void main(String[] args) {
        String temp = "";
        for (String s : new Line()){
            temp = temp + s + ",";
        }
        String q14 = temp;
        System.out.println(q14); // c,d,
    }
}
