
public class Staff extends AbstractEmployee{
	public Staff(String id, String name){
		super(id, name);
	}
	public String getCompellation(){
		return "さん";
	}
	public String getPost(){
		String[] posts = {"無し","係長","課長","部長"};
		if(this.getPostNumber() < posts.length){
			return posts[super.getPostNumber()];
		}else{
			return "";
		}
	}
	public void accept(Visitor visitor){
		if(visitor instanceof UserVisitor){
			UserVisitor userVisitor = (UserVisitor)visitor;
			userVisitor.visit(this);
		}
	}
}
