
package Main;

import java.util.Scanner;

import PersonAndCompanies.Company;
import PersonAndCompanies.Customer;
import PlaneAndFlight.Flight;
import Util.Init;


//Albin
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {


		new Init();

		Flight.printFlights();
		

		Customer c1=new Customer();
		
		MAIN_LOOP:while(true){
			new Booking(c1);
			System.out.println("Du you want to book another flight?");
			
			while(true){
				String input= new Scanner(System.in).nextLine();
				if (input.equalsIgnoreCase("yes")) continue;
				else if(input.equalsIgnoreCase("no")){
					System.out.println("Thank you for choosing Lexicon Flights AB, please come again.");
					break MAIN_LOOP;
				}else{
					System.out.println("I don't understand. Pleast answer with yes or no.");
				}
				
			}
		}
		Company.printCompanyIncome();
		
		c1.printTicketList();
		









		

	}
}
