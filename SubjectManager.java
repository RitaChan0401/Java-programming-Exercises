import java.util.ArrayList;
import java.util.List;


public class SubjectManager {
    private Subject subject;

    public SubjectManager(Subject subject){
        this.subject = subject;
    }

    public String getSubjectName(){
        return this.subject.getName();
    }

    public void print(){
        for (int i = 0; i < this.subject.size(); i++) {
            System.out.println(this.subject.get(i).getName() + " " + this.subject.get(i).getId() + " " + this.subject.get(i).getScore());
        }
    }

    public Subject searchId(String id){
        Subject subject1 = new Subject(id);
        for (int i = 0; i < this.subject.size(); i++) {
            if(this.subject.get(i).getId() == id){
                subject1.add(this.subject.get(i));
            }
        }return subject1;
    }

    public List<Record> getRecordList(){
        List<Record> list = new ArrayList<Record>();
        for (int i = 0; i < this.subject.size(); i++) {
            list.add(this.subject.get(i));
        }
        return list;
    }
}