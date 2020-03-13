public class PrivateCar extends Car{
    
    public PrivateCar(String numPlate, int timeAway){
        super(numPlate, timeAway);
    }

    @Override
    public String toString(){
        return this.numPlate + " (" + this.timeAway + " mins away) PrivateCar" ;
    }
}
