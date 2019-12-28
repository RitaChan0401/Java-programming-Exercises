import java.util.Iterator;
import java.util.ArrayList;

public class C4_3 {
	public static void main(String[] args){
		ArrayList<User> users = new ArrayList<User>();
		users.add(new Teacher("T999","高橋"));
		users.add(new Staff("s100","高田"));
		C4_3.print(users.iterator());
	}
	public static void print(Iterator<User> itr){
		for(; itr.hasNext();){
			User user = itr.next();
			if(user instanceof Teacher){
				Teacher teacher = (Teacher)user;
				System.out.print(teacher.getPostNumber());
			}else if(user instanceof Staff){
				Staff staff = (Staff)user;
				System.out.print(staff.getPostNumber());
			}
			System.out.print(" " + user.getId());
			System.out.println(" " + user.getName());
		}
	}
}
