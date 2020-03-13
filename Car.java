public class  Car{
    String numPlate;
    int timeAway;
    
    public Car(String numPlate, int timeAway){
        this.numPlate = numPlate;
        this.timeAway = timeAway;
    }

    public String getNumPlate(){
        return this.numPlate;
    }

    public int getTimeAway(){
	    return this.timeAway;
    }

    @Override
    public String toString(){
        return this.numPlate;
    }
}

