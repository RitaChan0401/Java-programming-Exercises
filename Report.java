public class Report implements Record{
    private String name;
    private String id;
    private int score;

    public Report(String name , String id){
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
}
