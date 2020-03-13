public class NormalCab extends Car{

    public NormalCab(String numPlate, int timeAway){
        super(numPlate, timeAway);
    }


    @Override
    public String toString(){
        return this.numPlate + " (" + this.timeAway + " mins away) NormalCab";
    }
}
