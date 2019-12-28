
public class Instructor implements Person{
	private String name;
	private String id;
	
	public Instructor(String id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String getId(){
		return this.id;
	}
}
