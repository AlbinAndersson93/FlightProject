
package PlaneAndFlight;

import java.util.ArrayList;



public class Plane {
	private int seatsEconomy;
	private int seatsFirstClass;
	ArrayList<Seat> seatArray=new ArrayList<>();
	String name;
	
	int totalNumberOfSeats = seatsEconomy + seatsFirstClass;
	
	public Plane(int seatsEconomy, int seatsFirstClass, String name) {

		this.seatsEconomy = seatsEconomy;
		this.seatsFirstClass = seatsFirstClass;
		this.name = name;
		totalNumberOfSeats = seatsEconomy + seatsFirstClass;
	
	}

		
	public int getTotalNumberOfSeats() {
		return totalNumberOfSeats;
	}
	
	public int getSeatsEconomy() {
		return seatsEconomy;
	}

	public int getSeatsFirstClass() {
		return seatsFirstClass;
	}

	public String getName() {
		return name;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}