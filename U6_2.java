public class U6_2 {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add( new Student("s001" , "adachi"));
        studentList.add( new Student("s002" , "iida"));

        for (int i = 0; i < studentList.size(); i++){
            Student student = studentList.get(i);
            System.out.println(student.getId() + " ");
            System.out.println(student.getName());
        }
    }
}
