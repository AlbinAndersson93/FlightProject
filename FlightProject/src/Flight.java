//Gabriella
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Flight {

 
	//fields
	String source;
	String destination;
	LocalDateTime departureTime;
	LocalDateTime arrivalTime;
	Plane plane;
	Seat[] seatList;
	Customer customer;
	static Scanner scan = new Scanner(System.in);
	PriceGroup pg;
	String nyttVal;
	static ArrayList<Flight> flightList=new ArrayList<>();

	//Constructor
	public Flight(int iD, String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, Plane plane) {

		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.plane = plane;
		seatList = this.plane.getSeatList();
		flightList.add(this);
	}
	public void removeCustomerFromSeat(Customer customer) {

		for (Seat s:seatList){
			try{if(s.getCustomer().equals(customer)){
				s.setCustomer(null);
				s.setNotTaken(true);
				System.out.println(s.getCustomer().getName()+" removed from seat.");
			}
			}catch (NullPointerException npe){ continue;
			}

		}
	}

	public void bookSeat(PriceGroup priceGroup, Customer customer) {
		int seatNumber = freeSeat(priceGroup);

		if (seatNumber > 0) {
			seatList[seatNumber-1].setSeatCustomer(customer, seatNumber);
			System.out.println("Nu bokas plats " + seatList[seatNumber-1].seatNr + " i " + seatList[seatNumber-1].priceGroup +"/" + plane.name + " till kund " + seatList[seatNumber-1].customer.name ); 
		}
		else {
			System.out.println("There are no free seats in " + priceGroup + " on this flight " + plane.name);

			if (priceGroup == PriceGroup.Economy) {
				pg = PriceGroup.FirstClass;
			} else pg = PriceGroup.Economy;		

			System.out.print("Do You want to book a seat in " + pg + " instead?");
			nyttVal = scan.next();
			if(nyttVal.equalsIgnoreCase("yes")) {
				bookSeat(pg, customer);
			}
		}
	}

	public int freeSeat(PriceGroup priceGroup){
		int seatNumber = 0;
		for(int i = 0; i < seatList.length; i++){
			if(seatList[i].priceGroup == priceGroup && seatList[i].isNotTaken()) {
				seatNumber = i+1;
				return seatNumber;
			}
		}
		return seatNumber;
	}


	//Getters och setters

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public Plane getPlane() {
		return plane;
	}

	public Seat[] getSeatList() {
		return seatList;
	}

	public void setSeatList(Seat[] seatList) {
		this.seatList = seatList;
	}
}


