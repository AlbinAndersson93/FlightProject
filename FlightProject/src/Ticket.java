import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
	protected String source;
	protected String destination;

	protected String departure;
	protected String arrival;
	
	protected String seat;
	protected String ticket;

	protected Date tDate;
	
	
	public Ticket(String source, String destination,
				  String departure, String arrival, 
				  String seat){
	
		this.source = source;
		this.destination = destination;

		this.departure = departure;
		this.arrival = arrival;
		
		this.seat = seat;
		this.ticket = "ARN1707170900-LAX1707171800-XREF1";

		
		tDate = new Date();	

		
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getTicket() {
		return ticket;
	}

	
	


	
	
	@Override
	public String toString(){
		return this.getTicket() + "\n"
					+ "----------\n"  
					+ this.source + " --- " + this.destination + " --- " + "\n"  
					+ this.departure + " --- " + this.arrival + " --- " + "\n"
					+ "Print Date: " + tDate;
	}

}
