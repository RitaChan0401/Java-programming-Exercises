import java.util.ArrayList;
import java.util.List;

public class SubjectList {
    private List<Subject> list = new ArrayList<Subject>();
    public SubjectList(){

    }
    public void add(Subject subject){
        this.list.add(subject);
    }
    public Subject get(int index){
        return this.list.get(index);
    }
    public int size(){
        return this.list.size();
    }
}