package Algorithm;

public class HashChain {
    private int bucketSize;
    private KeyCell[] table;
    public HashChain(int bucketSize){
        this.bucketSize = bucketSize;
        this.table = new KeyCell[bucketSize];
        for(int i = 0; i < bucketSize; i++){
            this.table[i] = new KeyCell(null , "dummy");
        }
    }

    public int hash(String key){
        int sum = 0;
        for(int i = 0; i < key.length(); i++){
            sum += (int)key.charAt(i);
        }
        return sum % this.bucketSize;
    }

    public void put(String key , Object data){
        int index = this.hash(key);
        KeyCell keyCell = this.table[index];
        while(keyCell.getNext() != null){
            keyCell = keyCell.getNext();
        }
        keyCell.setNext(new KeyCell(key , data));
    }

    public Object get(String key){
        int index = this.hash(key);
        KeyCell keyCell = this.table[index].getNext();
        while(keyCell != null){
            if(key.equals(keyCell.getKey())){
                return keyCell.getData();
            }
            keyCell = keyCell.getNext();
        }
        return null;
    }

    public Object remove(String key){
        int index = this.hash(key);
        KeyCell preKeyCell = this.table[index];
        KeyCell keyCell = preKeyCell.getNext();
        while(keyCell != null){
            if(key.equals(keyCell.getKey())){
                preKeyCell.setNext(keyCell.getNext());
                return keyCell.getData();
            }
            preKeyCell = keyCell;
            keyCell = keyCell.getNext();
        }
        return null;
    }
    public void print(){
        int size = this.table.length;
        for(int i = 0; i < size; i++){
            KeyCell keyCell = this.table[i].getNext();
            String s = "";
            while (keyCell != null){
                s = s + "[" + keyCell.getKey() + " " + keyCell.getData() + "]";
                keyCell = keyCell.getNext();
            }
            if(! s.equals("")){
                System.out.println(i + ":" + s);
            }

        }
    }
}

