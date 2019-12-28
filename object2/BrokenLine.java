package object2;

public class BrokenLine extends AbstractLine{
	private Character[] charcters = {new Stone(), new BrankChar(), new Stone()};
	
	public int size(){
		return this.charcters.length;
	}
	public Character get(int index){
		return this.charcters[index];
	}
	public void reversed(){
		for(int i = 0; i < this.size(); i++){
			Character character = this.get(i);
			character.reversed();
		}
	}
}
