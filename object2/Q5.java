package object2;

public class Q5 {
	public static void main(String[] args){
		Line line1 = new ArrowLine(new LineBase1(3), true);
		System.out.println(line1.toString());
		Line line2 = new ArrowLine(new BrokenLine(), false);
		System.out.println(line2.toString());
	}
}
