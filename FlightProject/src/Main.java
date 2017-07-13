//Albin
public class Main {

	public static void main(String[] args) {
		
		
		
		Customer c1=new Customer("Melvin", "Tummy Street 11", "13232", "Nacka", "123123123");
		Customer c2=new Customer("Saga", "This Street 11", "13232", "Nacka", "123123123");
		Customer c3=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");

		PriceGroup pg=PriceGroup.FirstClass;
		System.out.println(pg.getPrice());

		
		
		Booking b1=new Booking(c1);
		Booking b2=new Booking(c2);		
		Booking b3=new Booking(c3);
		
		
		
		

		
	}

}
