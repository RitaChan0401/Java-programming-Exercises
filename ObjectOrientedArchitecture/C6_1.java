
public class C6_1 {
	public static void main(String[] args){
		C6_1.test1();
		C6_1.test2();
	}
	public static void test1(){
		PrintVisitor printVisitor = new PrintVisitor();
		Teacher teacher = new Teacher("T999", "高橋");
		Student student = new Student("06Jk000", "鈴木");
		Staff staff = new Staff("S00", "金子");
		printVisitor.visit(teacher);
		printVisitor.visit(student);
		printVisitor.visit(staff);
	}
	public static void test2(){
		PrintVisitor printVisitor = new PrintVisitor();
		User teacher = new Teacher("T999", "高橋");
		User student = new Student("06Jk000", "鈴木");
		User staff = new Staff("S00", "金子");
		printVisitor.visit(teacher);
		printVisitor.visit(student);
		printVisitor.visit(staff);
	}
}
