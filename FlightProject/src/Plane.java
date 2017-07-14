//Gabriella
public class Plane {
	int seatsEconomy;
	int seatsFirstClass;
	int totalNumberOfSeats;
	String name;
	Seat[] seatList;
 
	public Plane(int seatsEconomy, int seatsFirstClass, String name) {
 
		this.seatsEconomy = seatsEconomy;
		this.seatsFirstClass = seatsFirstClass;
		this.name = name;
		totalNumberOfSeats = seatsEconomy + seatsFirstClass;
		seatList = new Seat[totalNumberOfSeats];

		for(int i = 0; i < seatsFirstClass; i++){
			seatList[i] = new Seat(i+1, PriceGroup.FirstClass);
		}
		for(int i = seatsEconomy; i < totalNumberOfSeats; i++){
			seatList[i] = new Seat(i+1, PriceGroup.Economy);
		}
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

	public Seat[] getSeatList() {
		return seatList;
	}




	//		public void setSeatList(Seat[] seatList) {
	//	this.seatList = seatList;
	//}	
}


