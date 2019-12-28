import java.util.ArrayList;

public class C7_1 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		print(list);
	}
	public static void print(ArrayList<String> list){
        System.out.println(String.join(",",list));
	}
}

