
public class U9_1 {
    public static void main(String[] args) {
        Subject uml = new Subject("UML");
        Task task = new Task("課題1" , "s001");
        task.setScore(90);
        task.getNumber(1);
        Report report = new Report("レポート1" , "s001");
        report.setScore(85);
        Test test = new Test("試験" , "s001");
        uml.add(task);
        uml.add(report);
        uml.add(test);

        int size = uml.size();
        for(int i = 0; i < size; i++){
            Record record = uml.get(i);
            System.out.println(record.getName() + " " + record.getId());
        }

    }
}
