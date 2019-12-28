import java.util.Iterator;
import java.util.ArrayList;

public class C4_2 {
	public static void main(String[] args){
		ArrayList<User> users = new ArrayList<User>();
		users.add(new Teacher("T999","高橋"));
		users.add(new Staff("S100","高田"));
		C4_2.print(users.iterator());
	}
	public static void print(Iterator<User> itr){
		for( ; itr.hasNext();){
			User user = itr.next();
			System.out.print(user.getId() + " ");
			System.out.println(user.getName());
		}
	}
	public static void print2(Iterable<User> iterable){
		for(User user: iterable){
			System.out.print(user.getId() + " ");
			System.out.println(user.getName());
		}
	}
}
