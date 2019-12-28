import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name;
    private List<Pet> list = new ArrayList<Pet>();

    public PetOwner(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addPet(Pet pet) {
        list.add(pet);
    }

    public Pet getPet(int index) {
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public String say(String name , String s){
        int ans=0;
        for (int i = 0; i < size(); i++){
            if (name.equals(list.get(i).getName())){ans=i;}
        }return this.name+":"+s+"->"+name+":"+this.list.get(ans).say(name);
    }
}


// UML 演習