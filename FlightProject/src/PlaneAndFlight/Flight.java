
package PlaneAndFlight;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import PersonAndCompanies.Customer;
import Util.Init;
import Util.PriceGroup;


public class Flight {


	//fields
	private int flightID;
	private String source;
	private String destination;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private Plane plane;



	
	private static ArrayList<Flight> flightList=new ArrayList<>();
	public static ArrayList<Flight> getFlightList() {
		return flightList;
	}

	public ArrayList<Seat> seatArray=new ArrayList<>();
	
	public ArrayList<Seat> getSeatArray() {
		return seatArray;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public int nrOfFreeSeatsLeft;




	//constructor
	public Flight(int flightID, String source, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime, Plane plane) {

		
		this.flightID = flightID;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.plane = plane;

		flightList.add(this);
		
		nrOfFreeSeatsLeft=plane.getTotalNumberOfSeats();

		for (int i=0;i<plane.getSeatsFirstClass();i++){
			seatArray.add(new Seat(i+1, PriceGroup.FirstClass));		
		}	
		for (int i=plane.getSeatsFirstClass();i<plane.getTotalNumberOfSeats();i++){
			seatArray.add(new Seat(i+1, PriceGroup.Economy));		
		}


	}

	public Plane getPlane() {
		return plane;
	}

	@Override
	public String toString() {
		return "Flight "+flightID + "[ source=" + source + ", destination=" + destination+"] departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ".";
	}

	public void newFlight(String source, String destrinatin, LocalDateTime departureTime,LocalDateTime arrivalTime){
		this.source = source;
		this.destination = destrinatin;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		System.out.println(plane.getName()+" got a new destination to fly from "+source+" at "+destrinatin+" to "+departureTime+" arriving at "+arrivalTime+"." );
		for (Seat s:seatArray){
			removeCustomerFromSeat(s.getCustomer());
		}

	}
	
	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public static void printFlights(){
		
		System.out.println("Currently we have the following flights planed:");
		Iterator<Map.Entry<Integer, Flight>> itFlight = Init.getFlightList().entrySet().iterator(); 
		while(itFlight.hasNext()){
			int key = itFlight.next().getKey();
			System.out.println("Flyg: " +key+" from "+Init.getFlightList().get(key).getSource() + " to " + Init.getFlightList().get(key).getDestination());

		}
	}
	public void removeCustomerFromSeat(Customer customer) {

		for (Seat s:seatArray){
			try{if(s.getCustomer().equals(customer)){
				s.setCustomer(null, s.getSeatNr());
				s.setTaken(false);
			}
			}catch (NullPointerException npe){ continue;
			}

		}
	}



	public int getFlightID() {
		return flightID;
	}


	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}


	


	

	public void setPlane(Plane plane) {
		this.plane = plane;
		System.out.println("The plane for this flight changed, and will now be operated by "+plane.getName());
		/*
		 * TODO: add more code to change this plane to other plane
		 */
	}



}