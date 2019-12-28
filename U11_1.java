public class U11_1 {
    public static void main(String[] args){
        Subject subject = new Subject("UML演習");
        Task task1 = new Task("課題1","s001");
        task1.setNumber(1);
        task1.setScore(90);
        Report report1 = new Report("レポート1","s001");
        report1.setScore(85);
        Test test1 = new Test("試験","s001");
        test1.setScore(95);
        Test test2 = new Test("試験","s002");
        test2.setScore(80);
        Test test3 = new Test("試験","s003");
        test3.setScore(85);
        subject.add(task1);
        subject.add(report1);
        subject.add(test1);
        subject.add(test2);
        subject.add(test3);
        System.out.println("教員");
        SubjectManager subjectManager = new SubjectManager(subject);
        System.out.println(subjectManager.getSubjectName());
        subjectManager.print();

        String id = "s001";
        System.out.println("学生:" + id);
        Subject subject1 = subjectManager.searchId(id);
        SubjectManager subjectManager1 = new SubjectManager(subject1);
        System.out.println(subjectManager.getSubjectName());
        subjectManager.print();
    }
}
