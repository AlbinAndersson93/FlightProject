import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
	protected String source;
	protected String destination;

	protected String departure;
	protected String arrival;
	private Booking booking;
	protected int seat;
	protected String ticketID;
	private Customer customer;
	private char mealChar; //for ticketID
	protected Date tDate;
	private int priceGroupInt; //for ticketID
		//change to take values from a booking
	public Ticket(Customer customer,String source, String destination,
				  String departure, String arrival, 
				  int seat){
	
		this.source = source;
		this.destination = destination;

		this.departure = departure;
		this.arrival = arrival;
		this.customer=customer;
		this.seat = seat;
	
		tDate = new Date();	

	}

	public Ticket(Booking booking2) {
	
		this.source=booking2.getSource();
		this.destination=booking2.getDestination();
		this.departure=booking2.getDeparture();
		this.arrival=booking2.getArrival();
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

	public String getDeparture() {
		return departure;
	}

	public String getArrival() {
		return arrival;
	}

	public String getSeat() {
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
					+ this.departure + " --- " + this.arrival + " --- " + "\n"
					+ "Print Date: " + tDate;
	}

}
