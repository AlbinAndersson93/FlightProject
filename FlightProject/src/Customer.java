
public class Customer {

	protected String name;
	protected String address;
	protected String zipcode;
	protected String city; 
	protected String cellphone;
 
	protected Ticket ticket;
	
	public Customer(String name, String address, String zipcode, String city, String cellphone) {
		super();
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.cellphone = cellphone;
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

	
	public void setTicket(Ticket newTicket) {
			this.ticket = newTicket;
	}
	
	
	@Override
	public String toString(){
		return this.name + "----------" + "----" + this.address;
	}
	
	
	
}

