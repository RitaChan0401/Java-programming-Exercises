public class SubjectListManager {
    private SubjectList subjectList;

    public SubjectListManager(SubjectList subjectList){
        this.subjectList = subjectList;
    }

    public void print(){
        int size = subjectList.size();
        for(int i = 0; i < size; i++){
            System.out.println(this.subjectList.get(i).getName());
        }
    }

    public SubjectList searchId(String id){
        SubjectList subjectList2 = new SubjectList();
        int size = subjectList.size();
        for(int i = 0; i < size; i++){
            Subject subject = subjectList.get(i);
            SubjectManager  subjectManager = new SubjectManager(subject);
            Subject subject1 = subjectManager.searchId(id);
            subjectList2.add(subject1);
        }
        return subjectList2;
    }

    public void printSubjectNameList(){
        int size = subjectList.size();
        for (int i = 0; i < size; i++){
            Subject subject = subjectList.get(i);
            String name = subject.getName();
        }
    }

    public void printSubjectRecord(int number){
        Subject subject = subjectList.get(number);
        SubjectManager subjectManager = new SubjectManager(subject);
        subjectManager.print();
    }

}
