class ThisClass{
    private int number;
    public void setNumber(int number){ //ローカル変数(引数)numberの値をメンバ変数(フォールド)のnumberに代入している
        this.number = number + 100;
    }
    public int getNumber(){
        return this.number;
    }
    public static void main(String[] args) {
        ThisClass A = new ThisClass();
        A.setNumber(1);
        System.out.println(A.getNumber()); // 101と出力される。
    }
}
