//Gabriella
public class Seat {

	boolean isNotTaken = true;
	Customer customer = null;
	int seatNr;
	PriceGroup priceGroup;
	int price;

 
	public Seat(int seatNr, PriceGroup priceGroup) {
		this.seatNr = seatNr;
		this.priceGroup = priceGroup;
		price = FlightPrice.getPrice(priceGroup);
	}

	public boolean isNotTaken() {
		return isNotTaken;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setNotTaken(boolean isNotTaken) {
		this.isNotTaken = isNotTaken;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getPrice() {
		return price;
	}

	public void setSeatCustomer(Customer customer, int seatNr) {
		isNotTaken = false;
		this.customer = customer;
		this.seatNr = seatNr;
	}

}
