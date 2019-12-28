package object2;

public class Arrow implements Character{
	private boolean rightSide;
	
	public Arrow(boolean rightSide){
		this.rightSide = rightSide;
	}
	public String getState(){
		if(this.rightSide){
			return ">";
		}else{
			return ">";
		}
	}
	public void reversed(){
		
	}
}
