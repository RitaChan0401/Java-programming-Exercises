
public class PrintVisitor2 implements UserVisitor{
	public void visit(User user){
		if(user instanceof Teacher){
			System.out.println("教員です。");
		}else if(user instanceof Staff){
			System.out.println("職員です。");
		}else if(user instanceof Student){
			System.out.println("生徒です。");
		}else{
			System.out.println("ユーザーです。");
		}
	}
	public void visit(Teacher teacher){
		System.out.print(teacher.getPost() + " ");
		System.out.print(teacher.getId() + " ");
		System.out.print(teacher.getName() + " ");
		System.out.println("先生");
	}
	public void visit(Student student){
		System.out.print(student.getId() + " ");
		System.out.print(student.getName() + " ");
		System.out.println("さん");
	}
	public void visit(Staff staff){
		System.out.print(staff.getPost() + " ");
		System.out.print(staff.getId() + " ");
		System.out.print(staff.getName() + " ");
		System.out.println("さん");
	}
}
