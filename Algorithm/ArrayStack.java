package Algorithm;

public class ArrayStack {
    private Object[] statck;
    private int sp;

    public ArrayStack(int stackSize){
        this.statck = new Object[stackSize];
        for(int i = 0; i < stackSize; i++){
            this.statck[i] = null;
        }
        this.sp = 0;
    }

    public void push(Object data){
        this.statck[this.sp] = data;
        this.sp++;
    }

    public Object pop(){
        this.sp--;
        Object data = this.statck[this.sp];
        this.statck[this.sp] = null;
        return data;
    }

    public boolean empty(){
        return this.sp == 0;
    }
}
