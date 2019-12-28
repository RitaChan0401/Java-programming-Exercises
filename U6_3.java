public class U6_3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("t001" , "kohama");
        teacher.setLaboratory(new Laboratory("信号処理応用研究室" , 50918));

        System.out.println("teacher id : " + teacher.getId());
        System.out.println("teacher name : " + teacher.getName());

        Laboratory laboratory = teacher.getLaboratory();

        System.out.println("Laboratory name : " + laboratory.getName());
        System.out.println("Laboratory number : " + laboratory.getNumber());

    }
}


