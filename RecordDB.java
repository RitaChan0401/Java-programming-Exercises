public class RecordDB{
    public static Subject getSubject0(){
        Subject subject = new Subject("UML演習");
        Task task1 = new Task("課題1" , "s001");
        task1.setNumber(1);
        task1.setScore(90);
        Report report1 = new Report("レポート1" , "s001");
        report1.setScore(85);
        Test test1= new Test("試験" , "s001");
        test1.setScore(95);
        Test test2 = new Test("試験" , "S002");
        test2.setScore(80);
        Test test3 = new Test("試験" , "s003");
        test3.setScore(85);
        subject.add(test1);
        subject.add(report1);
        subject.add(test1);
        subject.add(test2);
        subject.add(test3);
        return subject;
    }

    public static Subject getSubject1(){
        Subject subject =  new Subject("データベースとアルゴリズム");
        Task task1 = new Task("課題1" , "s001");
        task1.setNumber(1);
        task1.setScore(80);
        Report report1 = new Report("レポート1" , "s001");
        report1.setScore(75);
        Test test1= new Test("試験" , "s001");
        test1.setScore(75);
        Test test2 = new Test("試験" , "S002");
        test2.setScore(65);
        Test test3 = new Test("試験" , "s004");
        test3.setScore(100);
        subject.add(test1);
        subject.add(report1);
        subject.add(test1);
        subject.add(test2);
        subject.add(test3);
        return subject;
    }

    public static SubjectList getSubjectList(){
        SubjectList subjectList = new SubjectList();
        subjectList.add(RecordDB.getSubject0());
        subjectList.add(RecordDB.getSubject1());
        return subjectList;
    }
}