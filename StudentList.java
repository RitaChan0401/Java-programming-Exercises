import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> list = new ArrayList<Student>();

    public StudentList(){

    }

    public void add(Student student){
        this.list.add(student);
    }

    public Student get(int i){
        return this.list.get(i);
    }

    public Student remove(int i){
        return this.list.remove(i);
    }

    public int size(){
        return this.list.size();
    }
}
