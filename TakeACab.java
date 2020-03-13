public class TakeACab extends Service{

    private int fare;

    public TakeACab(){
        this.fare = 0;
    }

    @Override
    public int computeFare(Request r){
        int bookingFee = 200;
        int price = r.getDistance() * 33;
        this.fare = bookingFee + price;
        return this.fare;
    }

    @Override
    public String toString(){
        return "TakeACab";
    }

}
