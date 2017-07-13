import java.time.LocalDateTime;

//Albin
public class Main {
	public static void main(String[] args) {
		
		
		
		
		Plane p1=new Plane(5, 5, "Blue Bella");
		Flight f1=new Flight(1, "Arlanda", "Bromma", LocalDateTime.of(2017, 7, 31, 8, 20), LocalDateTime.of(2017, 7, 31, 10, 50), p1);
		Flight f2=new Flight(2, "Stockholm", "Nacka", LocalDateTime.of(2017, 7, 31, 8, 20), LocalDateTime.of(2017, 7, 31, 10, 50), p1);
		System.out.println(f2.getFlightID());
		
		
		Customer c1=new Customer();
		Booking.printFlights();
		new Booking(c1);
		
		
		Customer c2=new Customer();
		Booking.printFlights();
		new Booking(c2);
		Customer c3=new Customer();		
		Booking.printFlights();
		new Booking(c3);
		f1.seatArray.forEach(s->{System.out.println(s);});
		f2.seatArray.forEach(s->{System.out.println(s);});
		Customer c4=new Customer();		
		Customer c5=new Customer();
		Customer c6=new Customer();		
//		Customer c7=new Customer();
//		Customer c8=new Customer();

		
		
	

		
		
		PriceGroup pg=PriceGroup.FirstClass;
		System.out.println(pg.getPrice());

		
		//To create a new flight - clear the old seat list
		new Booking(c1);	
		
		new Booking(c2);		
		
		new Booking(c3);
		f1.removeCustomerFromSeat(c2);
		f1.removeCustomerFromSeat(c3);
		new Booking(c4);
		new Booking(c5);
		new Booking(c6);
//		Booking b7=new Booking(c7,f1);
//		Booking b8=new Booking(c8,f1);
		
		f1.seatArray.forEach(s->{System.out.println(s);});

		
		

		
	}

}
