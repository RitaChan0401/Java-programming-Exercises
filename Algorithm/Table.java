package Algorithm;

import Algorithm.Entry;

import java.util.ArrayList;

public class Table {
    private ArrayList<Entry> list = new ArrayList<Entry>();

    public Table(){

    }

    public void add(Entry entry){
        this.list.add(entry);
    }

    public Entry get(int i){
        return this.list.get(i);
    }

    public int size(){
        return this.list.size();
    }
}

