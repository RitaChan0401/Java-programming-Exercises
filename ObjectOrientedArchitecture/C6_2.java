
public class C6_2 {
	public static void main(String[] args){
		test2();
		test3();
	}
	public static void test2(){
		PrintVisitor printVisitor = new PrintVisitor();
		Teacher teacher = new Teacher("T999", "高橋");
		Student student = new Student("06Jk000", "鈴木");
		Staff staff = new Staff("S00", "金子");
		printVisitor.visit(teacher);
		printVisitor.visit(student);
		printVisitor.visit(staff);
	}
	public static void test3(){
		PrintVisitor printVisitor = new PrintVisitor();
		Teacher teacher = new Teacher("T999", "高橋");
		Student student = new Student("06Jk000", "鈴木");
		Staff staff = new Staff("S00", "金子");
		teacher.accept(printVisitor);
		student.accept(printVisitor);
		staff.accept(printVisitor);
	}
	
}
