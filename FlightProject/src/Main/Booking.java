//Albin
package Main;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Food.*;
import PersonAndCompanies.Company;
import PersonAndCompanies.Customer;
import PlaneAndFlight.Flight;
import PlaneAndFlight.Ticket;
import Util.PriceGroup;
//take customer, check if economy/firstclass. asign seat at random, add price, check if wants meal,
public class Booking {

		private Customer customer;
	private PriceGroup priceGroup;
	private boolean wantsFood=false;
	private int ticketPrice=0;
	private Flight flight; 
	private int assignedSeat;
	
	private String input="";
	private ArrayList<FoodItem> orderedFoodList=new ArrayList<>();
	Scanner in=new Scanner(System.in);
	
	
	public Customer getCustomer() {
		return customer;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public static void printFlights(){
		
		System.out.println("Currently we have the following flights planed:");
		Flight.getFlightList().forEach(s->{System.out.println(s.toString());});

	}
	public Flight getFlight() {
		return flight;
	}



	
	public Booking(Customer customer){
		System.out.println("Which flight do you want to take?");
		
		BOOKING_INPUT_LOOP:while(true){
			ticketPrice=0;
			input=in.nextLine();
			try{
				
				flight=Flight.getFlightList().stream().filter(s->s.getFlightID()==Integer.parseInt(input)).findFirst().get();
				
				
				if(flight.nrOfFreeSeatsLeft!=0){
					this.customer=customer;
					System.out.println("So you want to book a flight to "+flight.getDestination()+"."); //test line
					asignSeat();
					break;
					//
					
				}else{
					System.out.println("Sorry, that flight is full. Do you want to book a different flight?");
					while(true){
						input=in.nextLine();
						if (input.equalsIgnoreCase("yes")){
							Flight.printFlights();
							System.out.println("Which flight do you want to take?");
							break;
						}else{
							System.out.println("Thanks you, please come again!!");
							break BOOKING_INPUT_LOOP;
							
						}
					}
				}
			}catch (StringIndexOutOfBoundsException sioobe){break;
				
			}catch (Exception e){System.out.println("Wrong input");
			}
		
		}
	}



		
	

	private void asignSeat() {		//Assigning first/economy class and seat from user input
		System.out.println("Do you want to fly in first class or economy class? Enter 'First class' or 'Economy'");
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
			else System.out.println("Wrong input2");

		}

	}

	private void bookSeat(PriceGroup priceGroup){
		this.priceGroup=priceGroup;
		
		
		try{
			assignedSeat=flight.getSeatArray().stream().filter(s->s.getSeatType().equals(priceGroup)).filter(s->!s.isTaken()).findFirst().get().setSeatCustomer(customer);				
			System.out.println(priceGroup.toString()+" it is then. you'll get seat #"+assignedSeat+".");
			flight.nrOfFreeSeatsLeft--;
			ticketPrice+=priceGroup.getPrice();
			asignMeal();
			createTicket();
		}catch (NoSuchElementException nsee){
			System.out.println("No seats left in "+priceGroup.toString()+", do you want to buy a ticket in a different price group instead?");
			input=in.nextLine();
			if (input.equals("yes")){
				if (priceGroup.equals(PriceGroup.Economy)){
					bookSeat(PriceGroup.FirstClass);
				}else{
					bookSeat(PriceGroup.Economy);
				}
			}else{
				System.out.println("Then no flight for you! Mohahaha!");
				
				}

		}
	}



	private void asignMeal(){		//ask if they want meal, then run method for the class they belong to
		System.out.println("Do you want to pre-order a meal for your flight? 'yes' or 'no'");
		while(true){
			input=in.nextLine();

			if(input.equalsIgnoreCase("yes") ) {
				
				if(priceGroup.equals(PriceGroup.FirstClass)){
					System.out.println("printing first class menu");
					FoodService fs=new FoodService();
					fs.FirstClassFoodService();
					
					orderedFoodList = fs.getOrderList();
					ticketPrice+=(int)fs.TotalFoodPrice();
					break;
				}else{
					System.out.println("printing economy class menu");
					FoodService fs=new FoodService();
					fs.EconomyClassFoodService();
					orderedFoodList = fs.getOrderList();
					ticketPrice+=(int)fs.TotalFoodPrice();
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
		System.out.println("Total price for this ticket is: "+ticketPrice);
		Ticket newTicket=new Ticket(this);

		customer.setTicketList(newTicket);
		
		Company.addToCompanyIncome(ticketPrice);
		

	}






	public int getTotalPrice() {
		return ticketPrice;
	}




	public int getAssignedSeat() {
		return assignedSeat;
	}
	
	public ArrayList<FoodItem> getOrderedFoodList() {
		return orderedFoodList;
	}

	public PriceGroup getPriceGroup() {

		return priceGroup;
	}





@Override
	public String toString() {
		return "Booking [customer=" + customer + ", priceGroup=" + priceGroup+ ", wantsFood=" + wantsFood + ", totalPrice="
				+ ticketPrice + ", assignedSeat=" + assignedSeat + "]";
	}






}
