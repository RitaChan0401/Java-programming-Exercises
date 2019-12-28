import java.util.ArrayList;
public class UserLocator {
	private ArrayList<User> users = new ArrayList<User>();
	public UserLocator(){
		
	}
	public void add(User user){
		this.users.add(user);
	}
	public User get(int number){
		return this.users.get(number);
	}
	public int size(){
		return this.users.size();
	}

	public void printUsers(UserVisitor userVisitor){
		for(int i = 0; i < this.users.size(); i++){
			User user = this.users.get(i);
			user.accept(userVisitor);
			//System.out.println(user.getId() + user.getName());
		}
	}

}
