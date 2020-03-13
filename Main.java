import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Booking> booking = new ArrayList<Booking>();
		List<Car> cars = new ArrayList<Car>();
		
		Request request = new Request(sc.nextInt(), sc.nextInt(), sc.nextInt());
		while(sc.hasNext()){
			if(sc.next().equals("NormalCab")){
				NormalCab normalCab = new NormalCab(sc.next(), sc.nextInt());
				cars.add(normalCab);
			} else {
				PrivateCar privateCar = new PrivateCar(sc.next(), sc.nextInt());
				cars.add(privateCar);
			}
		}
		PriorityQueue<Booking> pq = new PriorityQueue<Booking>();
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i) instanceof NormalCab) {
				pq.add(new Booking((NormalCab) cars.get(i), new TakeACab(), request));
				pq.add(new Booking((NormalCab) cars.get(i), new JustRide(), request));
			} else {
				pq.add(new Booking((PrivateCar) cars.get(i), new ShareARide(), request));
				pq.add(new Booking((PrivateCar) cars.get(i), new JustRide(), request));
			} 
		}

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
				
	}
}

