package PersonAndCompanies;

import java.util.ArrayList;
import java.util.Scanner;

import PlaneAndFlight.Ticket;

public class Customer {

	protected String name;
	protected String address;
	protected String zipcode;
	protected String city; 
	protected String cellphone;
	private ArrayList<Ticket> ticketList=new ArrayList<>();
	protected Ticket ticket;
	Scanner in=new Scanner(System.in);
	String input="";
	
	public Customer() {
		System.out.print("Welcome! Enter your name: ");
		input=in.nextLine();
		this.name=input;
		System.out.print("And your phonenumber: ");
		input=in.nextLine();
		this.cellphone=input;
	
	}
//David
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}


	public String getCellphone() {
		return cellphone;
	}

	
	public void setTicketList(Ticket newTicket) {
			ticketList.add(newTicket);
	}
	
	public void printTicketList(){
		ticketList.forEach(s->{System.out.println(s);});
	}
	
	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}
	@Override
	public String toString(){
		return this.name + "----------" + "----" + this.address;
	}
	
	
	
}

