public class Student2{

    int grade = 1; // メンバ変数
    void student1(){
        int id_1 = 7; // ローカル変数
        System.out.println(this.grade); // メンバ変数なので参照可能
        System.out.println(id_1); // student1内に宣言したローカル変数なので参照可能
    }
    void student2(){
        int id_2  = 1000;
        System.out.println(grade); // メンバ変数なので参照可能
    }
}


class A{
    public static void main(String[] args) {
        Student2 A = new Student2();
        A.student1();

    }
}