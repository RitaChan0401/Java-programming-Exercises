public class Task implements Record {
    private String name;
    private String id;
    private int score;
    private int number;

    public Task(String name , String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public void setNumber(int  number){
        this.number = number;
    }

    public int getNumber(int i){
        return this.number;
    }
}
