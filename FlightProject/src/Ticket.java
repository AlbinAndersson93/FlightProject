//David
import java.time.LocalDateTime;

public class Ticket {
	protected String source;
	protected String destination;

	protected LocalDateTime departureTime;
	protected LocalDateTime arrivalTime;

	protected int seat;
	protected String ticketID;
	private Customer customer;
	private char mealChar; //for ticketID

	private int priceGroupInt; //for ticketID
		//change to take values from a booking


	public Ticket(Booking booking2) {
	
		this.source=booking2.getFlight().source;
		this.destination=booking2.getFlight().destination;
		this.departureTime=booking2.getFlight().departureTime;
		this.arrivalTime=booking2.getFlight().arrivalTime;
		this.customer=booking2.getCustomer();
		this.seat=booking2.getAssignedSeat();
		if (booking2.isWantsFood()) mealChar='y';
		if (!booking2.isWantsFood()) mealChar='n';
		if (booking2.getPriceGroup().equals(PriceGroup.FirstClass)) priceGroupInt=73;
		if (booking2.getPriceGroup().equals(PriceGroup.Economy)) priceGroupInt=24;
		this.ticketID = source.substring(0,2)+priceGroupInt+destination.substring(0,2)+customer.getName().substring(0,3)+(int)(Math.random()*20)+mealChar;
		ticketID=ticketID.toUpperCase();
		
	}

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

	public int getSeat() {
		return seat;
	}

	public String getTicketID() {
		return ticketID;
	}

	
	

	
	
	
	@Override
	public String toString(){
		return this.getTicketID() + "\n"
					+ "----------\n"  
					+ this.source + " --- " + this.destination + " --- " + "\n"  
					+ this.departureTime + " --- " + this.arrivalTime + " --- " + "\n";
	}

}
