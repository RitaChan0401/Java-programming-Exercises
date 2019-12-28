package Algorithm;

public class DoubleCell {
    private Object data;
    //次のセルへリンク
    private DoubleCell next = null;
    //前のセルヘリンク
    private DoubleCell prev = null;

    public DoubleCell(Object data){
        this.data = data;
    }

    public void setNext(DoubleCell next){
        this.next = next;
    }

    public DoubleCell getNext(){
        return this.next;
    }

    public void setPrev(DoubleCell prev){
        this.prev = prev;
    }

    public DoubleCell getPrev(){
        return this.prev;
    }
}
