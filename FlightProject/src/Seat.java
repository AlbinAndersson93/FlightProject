//Gabriella


public class Seat {

	boolean isTaken = false;
	Customer customer;
	int seatNr;
	PriceGroup seatType;

	public Seat(int seatNr, PriceGroup priceGroup) {
		seatType=priceGroup;
		this.seatNr = seatNr;
	}

	public PriceGroup getSeatType() {
		return seatType;
	}

	public boolean isTaken() {
		return isTaken;
	}

	@Override
	public String toString() {
		return "Seat [isTaken=" + isTaken + ", customer=" + customer + ", seatNr=" + seatNr + ", seatType=" + seatType
				+ "]";
	}

	public int getSeatNr() {
		return seatNr;
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

	public int bookThisSeat(Customer customer) {
		isTaken=true;
		this.customer=customer;
		return seatNr;
		
		
	}
	
	

}
