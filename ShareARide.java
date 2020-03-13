public class ShareARide extends Service{
    private int fare;

    public ShareARide(){
	    this.fare = 0;
    }

    @Override
    public int computeFare(Request r){
	    if(r.getTime() >= 600 && r.getTime() <= 900){
		    int price = 50 * r.getDistance() + 500;
		    return price/r.getNumPassengers();
	    } else{
		    int price = 50 * r.getDistance();
		    return price/r.getNumPassengers();
	    }
    }

    @Override
    public String toString(){
	    return "ShareARide";
    }
}


