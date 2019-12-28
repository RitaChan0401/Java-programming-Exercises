package java_practice;

public class argument {
    public static void  main(String[] args){
        rabbithouse("香風 智乃");
        rabbithouse("保登 心愛");
        rabbithouse("天々座 理世");
        amausaan("宇治松 千夜");
        fleur_du_lapin("桐間 紗路");
        System.out.println("");// 改行
    }
    public static void rabbithouse(String name){
        System.out.println("ラビットハウスの店員:"+ name);
    }
    public static void amausaan(String name){
        System.out.println("甘兎庵の店員:" + name);
    }
    public static void fleur_du_lapin(String name){
        System.out.println("フルール・ド・ラパンの店員:" + name);
    }
}