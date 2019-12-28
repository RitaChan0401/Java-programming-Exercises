package Algorithm;

public class ArrayQueue {
    private Object[] queue;
    private int front;
    private int rear;

    public ArrayQueue(int queueSize){
        this.queue = new Object[queueSize];
        for (int i = 0; i < queueSize; i++){
            this.queue[i] = null;
        }
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(Object data){
        this.queue[this.rear] = data;
        this.rear = (this.rear + 1) % this.queue.length;
    }

    public Object dequeue(){
        Object data = this.queue[this.front];
        this.queue[this.front] = null;
        this.front = (this.front + 1) % this.queue.length;
        return data;
    }

    public boolean empty(){
        return this.front == this.rear;
    }
}
