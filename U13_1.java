public class U13_1 {
    public static void main(String[] args) {
        SubjectList subjectList = RecordDB.getSubjectList();
        SubjectListManager subjectListManager = new SubjectListManager(subjectList);
        subjectListManager.print();
    }
}

