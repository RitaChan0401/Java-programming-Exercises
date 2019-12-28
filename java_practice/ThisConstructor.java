class ThisConstructor {
    private String ShopName;
    private String CharacterName;

    public ThisConstructor(String shopName , String CharacterName){
        this.ShopName = shopName;
        this.CharacterName = CharacterName;
    }

    // デフォルト値の設定
    public ThisConstructor(){
        this("ラビットハウス" , "香風 智乃");
    }

    // フィールドの初期化
    public void print(){
        System.out.println(ShopName+" : "+CharacterName);
    }
}

class Main6{
    public static void main(String[] args) {
        ThisConstructor tc1 = new ThisConstructor();
        tc1.print();

        ThisConstructor tc2 = new ThisConstructor("ラビットハウス" , "天々座 理世");
        tc2.print();
    }
}