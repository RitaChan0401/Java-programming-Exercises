package Algorithm;

public class SingleCell {
    private Object data;
    private SingleCell next = null;

    public SingleCell(Object data){
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }

    public void setNext(SingleCell next){
        this.next = next;
    }

    public SingleCell getNext(){
        return this.next;
    }
}
