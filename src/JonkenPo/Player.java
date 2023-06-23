public class Player{
    private String name;
    private int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(String name){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getScore(int score){
        return score;
    }

    public void setScore(){
        this.score = score;
    }
}