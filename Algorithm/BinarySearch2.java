package Algorithm;

public class BinarySearch2 {
    private Table table = new Table();

    public BinarySearch2(){

    }

    public void  add(int key , Object data){
        this.table.add(new Entry(key , data));
    }

    public Object search(int key){
        int low = 0;
        int high = this.table.size() - 1;
        while (low <= high){
            int middle = (low + high ) / 2;
            Entry entry = this.table.get(middle);
            if (key == entry.getKey()){
                return entry.getData();
            } else if (key < entry.getKey()){
                high = middle -1;
            }else {
                low = middle +1;
            }
        }
        return  null;
    }
}
