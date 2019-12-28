package Algorithm;

public class Bucket {
    private String key;
    private Object data;
    private BucketStatus status = BucketStatus.EMPTY;

    public Bucket(){

    }

    public void setKeyData(String key , Object data){
        this.key = key;
        this.data = data;
        this.status = BucketStatus.USE;
    }

    public String getKey(){
        return this.key;
    }

    public Object getData(){
        return this.data;
    }

    public boolean isEmpty(){
        return this.status == BucketStatus.EMPTY;
    }

    public boolean isUse(){
        return this.status  == BucketStatus.USE;
    }

    public boolean isDeleted(){
        return this.status == BucketStatus.DELETED;
    }

    public void delete(){
        this.status = BucketStatus.DELETED;
    }
}


