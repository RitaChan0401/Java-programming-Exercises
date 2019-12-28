import java.util.ArrayList;
import java.util.List;

public class FruitBasket{
    List<Fruit> list = new ArrayList<Fruit>();

    public FruitBasket(){

    }

    public void add(Fruit fruit){
        list.add(fruit);
    }

    public Fruit get(int index){
        return this.get(index);
    }

    public int size(){
        return this.list.size();
    }

    public Fruit remove(int index){
        return this.list.remove(index);
    }

    public String getName() {
        String s = "";
        for(int i = 0; i < this.list.size(); i++){
            s += " " + this.list.get(i).getName();
        }
        return s;
    }

    public int getPrice(){
        int sum = 0;
        for (int i = 0; i < this.list.size(); i++){
            sum += this.list.get(i).getPrice();
        }
        return sum;
    }




}
