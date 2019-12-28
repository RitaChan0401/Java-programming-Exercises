package object2;

public abstract class AbstractLine implements Line{
	public abstract int size();
	public abstract Character get(int index);
	public abstract void reversed();
	public String toString(){
		String temp = "";
		for(int i = 0; i < this.size(); i++){
			Character character = this.get(i);
			temp = temp + character.getState();
		}
		return temp;
	}
}
