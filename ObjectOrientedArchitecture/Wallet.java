import java.util.ArrayList;

public class Wallet implements Value {
	private ArrayList<Value> arrayList = new ArrayList<Value>();
	public Wallet() {
	}
	public void add(Value value) {
		this.arrayList.add(value);
	}
	public Value remove(int number) {
		for(int i = 0; i < this.arrayList.size(); i++) {
			Value value = this.arrayList.get(i);
			if(value.getValue() == number) {
				return this.arrayList.remove(i);
			}
		}
		return null;
	}
	public int size() {
		return this.arrayList.size();
	}
	public int getValue() {
		int sum = 0;
		for(int i = 0; i < this.arrayList.size(); i++) {
			Value value = this.arrayList.get(i);
			sum = sum + value.getValue();
		}
		return sum;
	}
}