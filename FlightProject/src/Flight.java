//Gabriella
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {

	
	//fields
	int flightID;
	String source;
	String destination;
	LocalDateTime departureTime;
	LocalDateTime arrivalTime;
	Plane plane;
	int nrOfSeatsEconomy;
	int nrOfSeatsFirstClass ;
	int nrOfFreeSeatsEconomy;
	int nrOfFreeSeatsFirstClass;
	Seat[] seatListEconomy;
	Seat[] seatListFirstClass;
	ArrayList<Seat> seatArray=new ArrayList<>();
	{
		for (int i=0;i<5;i++){
			seatArray.add(new Seat(i+1, PriceGroup.FirstClass));		
		}	
		for (int i=5;i<10;i++){
			seatArray.add(new Seat(i+1, PriceGroup.Economy));		
		}
	}
	
	
	
	//constructor
	public Flight(int flightID, String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, Plane plane) {

		this.flightID = flightID;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.plane = plane;
		nrOfSeatsEconomy = plane.getSeatsEconomy();
		nrOfSeatsFirstClass = plane.getSeatsFirstClass();
		
		seatListEconomy = new Seat[nrOfSeatsEconomy];
		seatListFirstClass = new Seat[nrOfSeatsFirstClass];
		
		
	
	}

	public int getFlightID() {
		return flightID;
	}
		

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}


	public int getNrOfFreeSeatsEconomy() {
		nrOfFreeSeatsEconomy = 0;
		for (int i = 0; i < nrOfSeatsEconomy; i++){
			if(!seatListEconomy[i].isTaken()) nrOfFreeSeatsEconomy++;
		}
		return nrOfFreeSeatsEconomy;
	}
	
	public int getNrOfFreeSeatsFirstClass() {
		nrOfFreeSeatsFirstClass = 0;
		for (int i = 0; i < nrOfSeatsFirstClass; i++){
			if(!seatListFirstClass[i].isTaken()) nrOfFreeSeatsFirstClass++;
		}
		return nrOfFreeSeatsFirstClass;
	}
	
	public void bookSeatEconomy() {
		nrOfFreeSeatsEconomy = 0;
		for (int i = 0; i < nrOfSeatsEconomy; i++){
			if(!seatListEconomy[i].isTaken()) nrOfFreeSeatsEconomy++;
		}
//		seatListEconomy 
		
		
	}
	


}