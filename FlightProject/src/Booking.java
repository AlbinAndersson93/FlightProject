//Albin

import java.util.NoSuchElementException;
import java.util.Scanner;
//take customer, check if economy/firstclass. asign seat at random, add price, check if wants meal,
public class Booking {

	Customer customer;


	private PriceGroup priceGroup;
	private static int firstClassSeat=1;
	private static int economyClassSeat=6;
	private boolean wantsFood=false;
	private int ticketPrice=0;

	

	private Flight flight; 


	Scanner in=new Scanner(System.in);
	String input="";

	private int assignedSeat;

	//fields to get from flight
	private String bookingID="ABC123";
	public Customer getCustomer() {
		return customer;
	}

	public PriceGroup getPriceGroup() {
		return priceGroup;
	}

	public static int getFirstClassSeat() {
		return firstClassSeat;
	}

	public static int getEconomyClassSeat() {
		return economyClassSeat;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public String getBookingID() {
		return bookingID;
	}











	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Scanner getIn() {
		return in;
	}

	public String getInput() {
		return input;
	}











	public Booking(Customer customer, Flight flight){

		if(flight.destination.equals("")) System.out.println("Error! Flight route missing!");
		else{
			this.customer=customer;
			this.flight=flight;
			System.out.println(customer.getName() +" is here to book a flight to "+flight.destination+".");
			asignSeat();
			asignMeal();
			createTicket();
		}
	}


	private void asignSeat() {		//Assigning first/economy class and seat from user input
		System.out.println("Hello "+ customer.getName()+". Do you want to fly in first class or economy class? Enter 'First class' or 'Economy'");
		while(true){
			input=in.nextLine();
			if (input.equalsIgnoreCase("First class")){
				bookSeat(PriceGroup.FirstClass);							
				break;
			}

			else if(input.equalsIgnoreCase("economy")) {
					bookSeat(PriceGroup.Economy);
				break;

			}
			else System.out.println("Wrong input");

		}
		
	}

	private void bookSeat(PriceGroup priceGroup){
		this.priceGroup=priceGroup;
		ticketPrice+=priceGroup.getPrice();
		try{
			assignedSeat=flight.seatArray.stream().filter(s->s.getSeatType().equals(priceGroup))
					.filter(s->!s.isTaken()).findFirst().get().bookThisSeat(customer);				
			System.out.println(priceGroup.toString()+" it is then. you have seat #"+assignedSeat);
		}catch (NoSuchElementException nsee){
			System.out.println("No seats left in "+priceGroup.toString()+", do you want to buy a ticket in a different price group instead?");
			input=in.nextLine();
			if (input.equals("yes")){
				if (priceGroup.equals(PriceGroup.Economy)){
					bookSeat(PriceGroup.FirstClass);
				}else{
					bookSeat(PriceGroup.Economy);
				}
			}else{}
		
		}
	}



	private void asignMeal(){		//ask if they want meal, then run method for the class they belong to
		System.out.println(customer.getName()+", do you want to pre-order a meal for your flight? 'yes' or 'no'");
		while(true){
			input=in.nextLine();
			
			if(input.equalsIgnoreCase("yes") ) {
				this.wantsFood=true;
				if(priceGroup.equals(PriceGroup.FirstClass)){
					System.out.println("printing first class menu");
					FoodService.FirstClassFoodService();
					break;
				}else{
					System.out.println("printing economy class menu");
					FoodService.EconomyClassFoodService();
					break;
				}
			}else if(input.equalsIgnoreCase("no")){
				System.out.println("No meal for you then.");
				break;
			}else{
				System.out.println("Wrong input, please enter 'yes' or 'no'.");
			}
		}
	}

	private void createTicket(){
		System.out.println("new ticket added to customer for "+customer.getName());
		Ticket newTicket=new Ticket(this);

		customer.setTicket(newTicket);
		System.out.println("ticket ID="+customer.ticket.getTicketID());
		Company.addToCompanyIncome(ticketPrice);
		System.out.println("company now has "+Company.getCompanyIncome()+" money.");

	}

	public void setWantsFood(boolean b) {
		this.wantsFood=b;
		System.out.println(wantsFood);
	}



	public boolean isWantsFood() {
		return wantsFood;
	}


	public int getTotalPrice() {
		return ticketPrice;
	}

	public void addToPrice(int price) {
		this.ticketPrice += price;
	}



	public int getAssignedSeat() {
		return assignedSeat;
	}



	@Override
	public String toString() {
		return "Booking [customer=" + customer + ", priceGroup=" + priceGroup+ ", wantsFood=" + wantsFood + ", totalPrice="
				+ ticketPrice + ", assignedSeat=" + assignedSeat + "]";
	}










}
