package Algorithm;

public class D8_HOA {
    public static void main(String[] args) {
        HashOpenAddress hash = new HashOpenAddress(100);
        hash.put("ぶどう" , "400");
        hash.put("いちご" , "500");
        hash.put("りんご" , "300");
        hash.put("みかん" , "200");
        hash.print();

        Object data = hash.get("いちご");
        System.out.println("いちご探索:" + data);
        Object data1 = hash.remove("いちご");
        System.out.println("いちごの消去" + data1);
        hash.print();
    }
}
