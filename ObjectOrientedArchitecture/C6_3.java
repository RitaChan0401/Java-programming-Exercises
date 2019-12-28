
public class C6_3 {
	public static void main(String[] args){
		UserLocator users = new UserLocator();
		users.add(new Teacher("T999", "高橋"));
		users.add(new Student("06JK000", "鈴木"));
		users.add(new Staff("S00", "金子"));
		users.printUsers(new PrintVisitor2());
	}
}
