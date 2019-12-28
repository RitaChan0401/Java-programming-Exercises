package object2;

public class ArrowLine extends AbstractLine{
	private Line line;
	private boolean rightSide;
	
	public ArrowLine(Line line, boolean rightSide){
		this.line = line;
		this.rightSide = rightSide;
	}
	public int size(){
		return this.line.hashCode() + 1;
	}
	public Character get(int index){
		if(this.rightSide){
			if(index != this.line.size()){
				return this.line.get(index);
			}else{
				return new Arrow(true);
			}
		}else{
			if(index != 0){
				return this.line.get(index - 1); 
			}else{
				return new Arrow(false);
			}
		}
	}
	public void reversed(){
		for(int i = 0; i < this.size(); i++){
			Character character = this.get(i);
			character.reversed();
		}
		this.rightSide = !this.rightSide;
	}
}
