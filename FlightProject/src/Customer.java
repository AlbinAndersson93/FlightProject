
public class Customer {

	protected String name;
	protected String address;
	protected String zipcode;
	protected String city;
	protected String cellphone;
 
	protected String voucher;
	
	public Customer(String name, String address, String zipcode, String city, String cellphone) {
		super();
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.cellphone = cellphone;
	}

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

	
	public void setTicket(String voucher) {
			this.voucher = voucher;
	}
	
	
	@Override
	public String toString(){
		return this.name + "----------" + "----" + this.address;
	}
	
	
	
}
