public class U12_1 {
    public static void main(String[] args) {
        SubjectList subjectList = RecordDB.getSubjectList();

        int size = subjectList.size();
        for (int i = 0; i < size; i++){
            Subject subject = subjectList.get(i);
            System.out.println( subject.getName());
            SubjectManager subjectManager = new SubjectManager(subject);
            subjectManager.print();
        }
    }
}
