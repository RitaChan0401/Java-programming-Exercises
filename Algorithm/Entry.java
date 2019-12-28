package Algorithm;

public class Entry {
    private Object data;
    private int key;

    public Entry(int key , Object data){
        this.key = key;
        this.data = data;
    }
    public int getKey(){
        return this.key;
    }

    public Object getData(){
        return this.data;
    }
}
