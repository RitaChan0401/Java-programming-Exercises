public class SetNumber {
    private int basicNum;
    private int specialNum;
    //int型の引数を持つコンストラクタ

    SetNumber () {
        //int型の引数を持つコンストラクタの呼び出し
        this(500);
    }

    SetNumber (int specialNum) {
        //共通の処理をこのコンストラクタのみに記載
        this(specialNum , 321);
    }



    SetNumber(int basicNum , int specialNum){
        this.basicNum = basicNum;
        this.specialNum = specialNum;
    }
    public static void main(String[] args) {
        //引数を持たないコンストラクタの呼び出し
        SetNumber insA = new SetNumber();
        System.out.println(insA.basicNum);
        System.out.println(insA.specialNum);

    }
}