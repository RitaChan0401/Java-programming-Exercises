package object2;

public class LineBase1 extends AbstractLine{
	private Stone stone = new Stone();
	private int size = 0;
	
	public LineBase1(int size){
		this.size = size;
	}
	public int size(){
		return this.size;
	}
	public Character get(int index){
		return stone;
	}
	public void reversed(){
		this.stone.reversed();
	}
}
