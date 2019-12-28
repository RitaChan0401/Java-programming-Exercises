package Algorithm;

public class D8_1 {
    public static void main(String[] args) {
        String[] names = {"ぶどう" , "いちご" , "りんご" , "みかん"};

        for(String name : names){
            System.out.println(name + ":" + hash(name));
        }
    }
    public static int hash(String key){
        int sum = 0;
        for (int i = 0; i < key.length(); i++){
            sum = sum + (int)key.charAt(i);
        }
        return sum % 100;
    }
}

