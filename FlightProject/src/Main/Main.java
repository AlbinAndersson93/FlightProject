
package Main;

import java.util.Scanner;

import PersonAndCompanies.Company;
import PersonAndCompanies.Customer;
import PlaneAndFlight.Flight;
import Util.Init;
import Util.PriceGroup;

//Albin
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {


		new Init();

		Flight.printFlights();

		Customer c1=new Customer();
		
		while(true){
			new Booking(c1);
			System.out.println("Du you want to book another flight?");
			if (new Scanner(System.in).nextLine().equalsIgnoreCase("yes")) continue;
			System.out.println("Thank you for choosing Lexicon Flights AB, please come again.");
			break;
		}
		Company.printCompanyIncome();
		
		c1.printTicketList();
		









		

	}
}
