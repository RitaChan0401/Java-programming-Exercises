
public abstract class AbstractEmployee implements Employee{
	private String id;
	private String name;
	private int postNumber;
	
	public AbstractEmployee(String id, String name){
		this.id = id;
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getId(){
		return this.id;
	}
	public int getPostNumber(){
		return this.postNumber;
	}
	public void setPostNumber(int postNumber){
		this.postNumber = postNumber;
	}
	public abstract String getCompellation();
	public abstract String getPost();
}
