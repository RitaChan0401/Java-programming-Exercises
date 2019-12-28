
public class Teacher extends AbstractEmployee{
	
	public Teacher(String id, String name){
		super(id, name);
	}
	public String getCompellation(){
		return "先生";
	}
	public String getPost(){
		String[] posts = {"助手","講師","助教授","教授"};
		if(this.getPostNumber() < posts.length){
			return posts[super.getPostNumber()];
		}else{
			return "";
		}
	}
	public void accept(Visitor visitor){		//visitorがUserVisitor型なら
		if(visitor instanceof UserVisitor){
			UserVisitor userVisitor = (UserVisitor)visitor;	//userVisitorにUserVisitor型のvisitorを代入
			userVisitor.visit(this);
		}
	}
}
