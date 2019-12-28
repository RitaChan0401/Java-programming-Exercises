package Algorithm;

public class D8_HC {
    public static void main(String[] args) {
        HashChain hash = new HashChain(100);
        hash.put("ぶどう" , "400");
        hash.put("いちご" , "500");
        hash.put("りんご" , "300");
        hash.put("みかん" , "200");
        hash.print();

        Object data = hash.get("いちご");
        System.out.println("いちごの検索:" + data);
        Object datal  = hash.remove("いちご");
        System.out.println("いちご削除:" + datal);
        hash.print();
    }
}
