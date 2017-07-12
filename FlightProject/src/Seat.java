import java.beans.Customizer;

public class Seat {

	boolean isTaken = false;
	Customer customer;
	int seatNr;

	public Seat(Customer customer, int seatNr) {
		this.customer = customer;
		this.seatNr = seatNr;
	}

	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer, int seatNr) {
		isTaken = true;
		this.customer = customer;
		this.seatNr = seatNr;
	}

}
