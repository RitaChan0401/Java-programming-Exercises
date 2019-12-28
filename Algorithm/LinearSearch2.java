package Algorithm;

import Algorithm.Entry;

public class LinearSearch2 {
    private Table table = new Table();

    public LinearSearch2(){

    }

    public void add(int key , Object data){
        this.table.add(new Entry(key, data));
    }

    public Object search(int key){
        int i = 0;
        while(i < this.table.size()){
            Entry entry = this.table.get(i); if(entry.getKey() == key){
                return entry.getData();
            }
            i++;
        }
        return null;
    }
}

