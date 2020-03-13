import java.util.*;

public class Booking implements Comparable<Booking>{

    private Car car;
    private Service service;
    private Request request;
    private int fare;

    public Booking( Car car, Service service, Request request){
        this.car = car;
        this.service = service;
        this.request = request;
        this.fare = service.computeFare(request);
    }

    public int getFare(){
	    return this.fare;
    }

    public Car getCar(){
	    return this.car;
    }

    @Override
    public int compareTo (Booking b1){
	    if(this.fare > b1.getFare()){
		    return 1;
	    } else if ( this.fare == (b1.getFare())){
		    if (this.car.getTimeAway() > b1.getCar().getTimeAway()){
			    return 1;
		    } else {
			    return -1;
		    }
	    } else {
		    return -1;
	    }
    }
	    


    @Override
    public String toString(){
        return "$" + this.fare/100 + "." + String.format("%02d",this.fare%100) + " using " + this.car + " (" + this.service + ")";
    }
}

