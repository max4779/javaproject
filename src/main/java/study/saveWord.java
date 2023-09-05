package study;

public class saveWord {
    private int level;
    private String word;

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level=level;
    }

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word=word;
    }

    public saveWord(int level, String word){
        this.level = level;
        this.word = word;

    }
}
