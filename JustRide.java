public class JustRide extends Service{
    private int fare;
    
    public JustRide(){
        this.fare = 0;
    }



    @Override
    public int computeFare(Request r){
        if(r.getTime() >= 600 && r.getTime()<= 900){
            int surcharge = 500;
            int price = r.getDistance() * 22;
            this.fare = surcharge + price;
            return this.fare;
        } else {
            int price = r.getDistance() * 22;
            this.fare = price;
            return this.fare;
        }
    }

    @Override
    public String toString(){
        return "JustRide";
    }
}


