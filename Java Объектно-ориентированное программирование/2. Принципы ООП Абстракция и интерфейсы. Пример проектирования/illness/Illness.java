package illness;

public class Illness {
    String illness;

    public Illness(String illness){
        this.illness = illness;
    }

    public void setIllness(String title){
        this.illness = title;
    }

    public String getIllness(){
        return illness;
    }

    @Override
    public String toString() {
        return illness;
    }
}
