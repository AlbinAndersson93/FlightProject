import java.util.Scanner;
//take customer, check if economy/firstclass. asign seat at random, add price, check if wants meal,
public class Booking {

	Customer customer;


	private ClassType classType;
	private static int firstClassSeat=1;
	private static int economyClassSeat=6;
	private boolean wantsFood=false;
	private int ticketPrice=90;

	private int assignedSeat;

	//fields to get from flight
	String bookingID="ABC123";
	String destination="That Other Town";
	String source="This Town";
	String flightID="FlightID1";
	String plane="Blue Bella";


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
				this.classType= ClassType.FIRST_CLASS;
				ticketPrice+=20000;	//TODO:set to non-permanent
				assignedSeat=firstClassSeat++; //TODO:set to a better list
				System.out.println("first class it is then. you have seat #"+assignedSeat);
				break;

			}

			else if(input.equalsIgnoreCase("economy")) {
				classType=ClassType.ECONOMY_CLASS;
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
				if(classType.equals(ClassType.FIRST_CLASS)){
					System.out.println("printing first class menu");
					FoodService.FirstClassFoodService();
					break;
				}else{
					System.out.println("printing economy class menu");
					FoodService.EconomyClassFoodService();
					break;
				}
			}else if(input.equalsIgnoreCase("no")){
				System.out.println("No meal it i");
			}else{
				System.out.println("Wrong input, please enter 'yes' or 'no'.");
			}
		}
	}

	private void createTicket(){
		System.out.println("new ticket added to customer for "+customer.getName());
		Ticket newTicket=new Ticket(destination,source,Integer.toString(assignedSeat),customer.getName(), bookingID);
		customer.setTicket(newTicket);
		System.out.println("==="+customer.ticket.getTicket());
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



	public ClassType getClassType() {
		return classType;
	}

	public int getAssignedSeat() {
		return assignedSeat;
	}



	@Override
	public String toString() {
		return "Booking [customer=" + customer + ", classType=" + classType + ", wantsFood=" + wantsFood + ", totalPrice="
				+ ticketPrice + ", assignedSeat=" + assignedSeat + "]";
	}










}
