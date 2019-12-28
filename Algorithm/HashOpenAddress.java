package Algorithm;

import Algorithm.Bucket;

public class HashOpenAddress {

    private int bucketSize;
    private Bucket[] table;

    public HashOpenAddress(int bucketSize){
        this.bucketSize = bucketSize;
        this.table = new Bucket[bucketSize];
        for(int i = 0; i < bucketSize; i++){
            this.table[i] = new Bucket();
        }
    }

    public int hash(String key){
        int sum = 0;
        for(int i = 0; i < key.length(); i++){
            sum += (int)key.charAt(i);
        }
        int index = sum % this.bucketSize;
        return index;
    }

    public int rehash(int h){
        return (h + 1) % this.bucketSize;
    }

    public void put(String key , Object data){
        int index = this.hash(key);
        for(int i = 0; i < this.bucketSize; i++){
            Bucket bucket = this.table[index];
            if(! bucket.isUse()){
                bucket.setKeyData(key , data);
                return;
            }else{
                index = this.rehash(index);
            }
        }
    }

    public Object get(String key){
        int index = this.hash(key);
        for(int i = 0; i < this.bucketSize; i++){
            Bucket bucket = this.table[index];
            if(bucket.isEmpty()){
                return null;
            }else if( bucket.isUse()){
                if (key.equals(bucket.getKey())){
                    return bucket.getData();
                }
            }
            index = this.rehash(index);
        }
        return null;
    }

    public Object remove(String key){
        int index = this.hash(key);
        for (int i = 0; i < this.bucketSize; i++){
            Bucket bucket = this.table[index];
            if (bucket.isEmpty()){
                return null;
            }else if(bucket.isUse()){
                if(key.equals(bucket.getKey())){
                    bucket.delete();
                    return bucket.getData();
                }
            }
            index = this.rehash(index);
        }
        return null;
    }
    public void print(){
        for (int i = 0; i < this.bucketSize; i++){
            Bucket bucket = this.table[i];
            if(bucket.isUse()){
                System.out.print(i + ":USE:");
                System.out.println(bucket.getKey() + " " + bucket.getData());
            }else if (bucket.isDeleted()){
                System.out.println(i + ":DELETED");
            }else if (bucket.isEmpty()){
                //System.out.println(i + ":EMPTY");
            }
        }
    }
}
