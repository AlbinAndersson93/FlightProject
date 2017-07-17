//David

package PlaneAndFlight;

import java.time.LocalDateTime;
import java.util.ArrayList;

import Food.*;
import Main.Booking;
import PersonAndCompanies.Customer;
import Util.PriceGroup;

public class Ticket {
	protected String source;
	protected String destination;

	protected LocalDateTime departureTime;
	protected LocalDateTime arrivalTime;

	protected int seat;
	protected String ticketID;
	private Customer customer;
	private int mealChar; //for ticketID

	private int priceGroupInt; //for ticketID
		//change to take values from a booking
	private ArrayList<FoodItem> orderedFoodList;
	private int ticketPrice;


	public Ticket(Booking booking2) {
	
		this.ticketPrice=booking2.getTicketPrice();
		this.orderedFoodList=booking2.getOrderedFoodList();
		this.source=booking2.getFlight().getSource();
		this.destination=booking2.getFlight().getDestination();
		this.departureTime=booking2.getFlight().getDepartureTime();
		this.arrivalTime=booking2.getFlight().getArrivalTime();
		this.customer=booking2.getCustomer();
		this.seat=booking2.getAssignedSeat();
		this.mealChar=booking2.getOrderedFoodList().size();
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
	public String toString() {
		return "---Ticket---         price: "+ticketPrice+"\n"
				+ customer.getName()+" || "+ticketID + "\n"
						+ "From: "+source+" at "+departureTime+"   To: "+destination+" at "+arrivalTime+"\n"
								+ "# of food items ordered: "+ orderedFoodList.size()+"\n------"; 
		
	}

	
	

	
	
	
	

}
