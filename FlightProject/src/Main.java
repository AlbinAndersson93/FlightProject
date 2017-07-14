import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

//Albin
public class Main {
	
	public static void main(String[] args) {
		 
	
		Plane p1=new Plane(5, 5, "Blue Bella");
		Flight f1=new Flight(1, "Arlanda", "Bromma", LocalDateTime.of(2017, 7, 31, 8, 20), LocalDateTime.of(2017, 7, 31, 10, 50), p1);
		Flight f2=new Flight(2, "Stockholm", "Nacka", LocalDateTime.of(2017, 7, 31, 8, 20), LocalDateTime.of(2017, 7, 31, 10, 50), p1);
		
		Customer c1=new Customer("Melvin", "Tummy Street 11", "13232", "Nacka", "123123123");
		Customer c2=new Customer("Saga", "This Street 11", "13232", "Nacka", "123123123");
		Customer c3=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");

		new Booking(c1, f1);
		
		System.out.println(Init.flightList.get(14).destination);
		
		Booking.printFlights();
		
//		new Booking(c1, Init.flightList.get(14));
//		new Booking(c2, Init.flightList.get(14));		
//		Init.flightList.get(14).removeCustomerFromSeat(c1);
//		new Booking(c3, Init.flightList.get(14));
		
		
		
		

		
	}

}