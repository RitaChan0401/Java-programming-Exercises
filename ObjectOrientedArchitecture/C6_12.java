import java.util.ArrayList;

public class C6_12 {
	public static void main(String[] args){
		ArrayList<User> list = new ArrayList<User>();
		list.add(new Teacher("T999", "高橋"));
		list.add(new Student("06JK000", "鈴木"));
		list.add(new Staff("S00", "金子"));
		
		UserVisitor printVisitor = new PrintVisitor2();
		for(int i = 0; i < list.size(); i++){
			User user = list.get(i);
			user.accept(printVisitor);
		}
	}
}