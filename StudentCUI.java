import java.util.Scanner;

public class StudentCUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("学籍番号>");
        String id = scanner.nextLine();

        SubjectList subjectList1  = RecordDB.getSubjectList();
        SubjectListManager subjecListtManager1 = new SubjectListManager(subjectList1);
        SubjectList subjectList2 = subjecListtManager1.searchId(id);

        if (subjectList2.size() == 0) {
            System.out.println("データがありません。");
            return;
        }

        System.out.println("0:全科目");
        System.out.println("1:科目選択");
        System.out.print("番号>");
        int select = scanner.nextInt();

        SubjectListManager subjectListManager2 = new SubjectListManager(subjectList2);
        if(select == 0){
            subjectListManager2.print();
            return;
        }

        subjectListManager2.printSubjectNameList();
        System.out.print("番号>");
        int number = scanner.nextInt();

        subjectListManager2.printSubjectRecord(number);

    }
}
