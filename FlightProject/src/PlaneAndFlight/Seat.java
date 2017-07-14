//Gabriella

package PlaneAndFlight;

import PersonAndCompanies.Customer;
import Util.PriceGroup;

public class Seat {

	private boolean isTaken = false;
	private Customer customer;
	private int seatNr;
	private PriceGroup seatType;
	private int price;

	public Seat(int seatNr, PriceGroup priceGroup) {
		seatType=priceGroup;
		this.seatNr = seatNr;
		price=priceGroup.getPrice();
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

	public int getPrice() {
		return price;
	}

	public int setSeatCustomer(Customer customer) {
		isTaken=true;
		this.customer=customer;
		return seatNr;
		
		
	}
	
	

}
