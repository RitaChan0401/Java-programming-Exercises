package Algorithm;

public class KeyCell {
    private String key;
    private Object data;
    private KeyCell next = null;

    public KeyCell(String key , Object data){
        this.key = key;
        this.data = data;
    }

    public String getKey(){
        return this.key;
    }

    public Object getData(){
        return this.data;
    }

    public void setNext(KeyCell next){
        this.next = next;
    }

    public KeyCell getNext(){
        return this.next;
    }
}
