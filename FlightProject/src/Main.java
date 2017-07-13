import java.time.LocalDateTime;

//Albin
public class Main {
	public static void main(String[] args) {
		
		
		
		
		Plane p1=new Plane(5, 5, "Blue Bella");
		Flight f1=new Flight(1, "Arlanda", "Bromma", LocalDateTime.of(2017, 7, 31, 8, 20), LocalDateTime.of(2017, 7, 31, 10, 50), p1);
		Flight f2=new Flight(2, "Stockholm", "Nacka", LocalDateTime.of(2017, 7, 31, 8, 20), LocalDateTime.of(2017, 7, 31, 10, 50), p1);
		
		Customer c1=new Customer("Melvin", "Tummy Street 11", "13232", "Nacka", "123123123");
		Customer c2=new Customer("Saga", "This Street 11", "13232", "Nacka", "123123123");
//		Customer c3=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");		
//	
//		Customer c4=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");		
//		Customer c5=new Customer("Saga", "This Street 11", "13232", "Nacka", "123123123");
//		Customer c6=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");		
//		Customer c7=new Customer("Saga", "This Street 11", "13232", "Nacka", "123123123");
//		Customer c8=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");

		
		
		

		
		
		PriceGroup pg=PriceGroup.FirstClass;
		System.out.println(pg.getPrice());

		
		//To create a new flight - clear the old seat list
		new Booking(c1, f1);		
		new Booking(c2,f2);		
//		Booking b3=new Booking(c3);
//		Booking b4=new Booking(c4);
//		Booking b5=new Booking(c5);
//		Booking b6=new Booking(c6);
//		Booking b7=new Booking(c7);
//		Booking b8=new Booking(c8);
		
		f1.seatArray.forEach(s->{System.out.println(s);});
		f2.seatArray.forEach(s->{System.out.println(s);});
		
		

		
	}

}
