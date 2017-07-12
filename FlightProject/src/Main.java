public class Main {

	public static void main(String[] args) {
		
		
		Customer c1=new Customer("Melvin", "Tummy Street 11", "13232", "Nacka", "123123123");
		Customer c2=new Customer("Saga", "This Street 11", "13232", "Nacka", "123123123");
		Customer c3=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");
		Booking b1=new Booking(c1);
	
		
		System.out.println(b1.getTotalPrice());
		
		Booking b2=new Booking(c2);
		
		
		
		Booking b3=new Booking(c3);
		
		
		
		System.out.println(b3.getTotalPrice());
		
//		Booking b4=new Booking("Ylva");
		
		
	}

}
