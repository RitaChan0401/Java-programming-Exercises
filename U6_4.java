public class U6_4 {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new Student("s001" , "adachi"));
        studentList.add(new Student("s002" , "iida"));
        studentList.add(new Student("s003" , "uchida"));

        for (int i = 0; i < studentList.size(); i++){
            Student student = studentList.get(i);
            System.out.println(student.getId() + " ");
            System.out.println(student.getName());
        }

    }
}
