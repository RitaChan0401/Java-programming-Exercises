import java.util.Random;

public abstract class AbstractDice implements Castable{
	protected Random random = new Random();
	protected int value = 1;
	
	public AbstractDice(){
		this.cast();
	}
	public abstract void cast();
	
	public int getValue(){
		return this.value;
	}
}
