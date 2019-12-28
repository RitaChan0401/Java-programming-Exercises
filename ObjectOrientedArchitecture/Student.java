
public class Student implements User{
	private String id;
	private String name;
	
	public Student(String id, String name){
		this.id = id;
		this.name = name;
	}
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getCompellation(){
		return null;
	}
	public void accept(Visitor visitor){
		if(visitor instanceof UserVisitor){
			UserVisitor userVisitor = (UserVisitor)visitor;	//visitorがUserVisitor型ならvisitor型に変換
			userVisitor.visit(this);
		}
	}
}
