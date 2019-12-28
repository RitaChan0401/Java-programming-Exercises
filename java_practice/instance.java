package java_practice;

class instance {
    String name = "白露型駆逐艦『夕立』"; //メンバ変数

    void shipType(){
        System.out.println("白露型");
    }
}

class mainClass{
    public static void main(String[] args) {
        instance A = new instance();
        System.out.println(A.name);
        A.shipType();
    }
}
