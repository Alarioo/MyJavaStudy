package day251_273.Poker;

public class poker {
    private int rank;
    private String face;
    public  poker(){ }
    public  poker(int rank,String face){
        this.rank=rank;
        this.face=face;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public void setFace(String suit){
        this.face=face;
    }

    public int getRank(){
        return rank;
    }
    public String getFace(){
        return face;
    }

}
