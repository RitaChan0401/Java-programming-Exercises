package Algorithm;

public class Cell {
    private Object data;
    private Cell next = null;

    public Cell(Object data){
        this.data = data;
    }

    public  Object getData(){
        return this.data;
    }

    public void setNext(Cell next){
        this.next = next;
    }

    public Cell getNext(){
        return this.next;
    }
}


//データ構造とアルゴリズム
