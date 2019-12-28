package object2;

public class Stone implements Character{
	private boolean rightSide = true;
	public String getState(){
		if(this.rightSide){
			return "-";
		}else{
			return "X";
		}
	}
	public void reversed(){
		if(this.rightSide){
			this.rightSide = false;
		}else{
			this.rightSide = true;
		}
	}
}
