public class U13_2 {
    public static void main(String[] args) {
        SubjectList subjectList = RecordDB.getSubjectList();
        SubjectListManager subjectListManager = new SubjectListManager(subjectList);

        String id = "s001";
        SubjectList subjectList1 = subjectListManager.searchId(id);
        SubjectListManager subjectListManager1 = new SubjectListManager(subjectList1);
        subjectListManager1.print();
    }
}
