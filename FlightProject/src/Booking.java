import java.util.Scanner;
//take customer, check if economy/firstclass. asign seat at random, add price, check if wants meal,
public class Booking {

	Customer customer;


	private PriceGroup priceGroup;
	private static int firstClassSeat=1;
	private static int economyClassSeat=6;
	private boolean wantsFood=false;
	private int ticketPrice=90;

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

	public String getDestination() {
		return destination;
	}

	public String getSource() {
		return source;
	}

	public String getFlightID() {
		return flightID;
	}

	public String getPlane() {
		return plane;
	}

	public String getDeparture() {
		return departure;
	}
 
	public String getArrival() {
		return arrival;
	}

	public Scanner getIn() {
		return in;
	}

	public String getInput() {
		return input;
	}

	

	private String destination="Indigo plateu";
	private String source="Arlanda";
	private String flightID="FlightID1";
	private String plane="Blue Bella";
	private String departure="8:00";
	private String arrival="13:25";
	
	
	
	Scanner in=new Scanner(System.in);
	String input="";


	


	


	public Booking(Customer customer) {
		this.customer=customer;
		System.out.println(customer.getName() +" is here to book a flight.");
		asignSeat();
		asignMeal();
		createTicket();
		

	}

	private void asignSeat() {		//Assigning first/economy class and seat from user input
		System.out.println("Hello "+ customer.getName()+". Do you want to fly in first class or economy class? Enter 'First class' or 'Economy'");

		while(true){
			input=in.nextLine();
			if (input.equalsIgnoreCase("First class")){
				priceGroup= PriceGroup.FirstClass;
				ticketPrice+=20000;	//TODO:set to non-permanent
				assignedSeat=firstClassSeat++; //TODO:set to a better list
				System.out.println("first class it is then. you have seat #"+assignedSeat);
				break;

			}

			else if(input.equalsIgnoreCase("economy")) {
				priceGroup=PriceGroup.Economy;
				ticketPrice+=5000;//TODO:set to non-permanent
				assignedSeat=economyClassSeat++;//TODO:set to a better list
				System.out.println("economy class it is then. you have seat #"+assignedSeat);
				break;
			}
			else System.out.println("Wrong input");

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
//		Ticket newTicket=new Ticket(customer,destination,source,assignedSeat,customer.getName(), bookingID);
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
