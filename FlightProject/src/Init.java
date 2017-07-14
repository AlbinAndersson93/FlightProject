//Gabriella
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Init {

	static Map<Integer ,Plane> planeList = new HashMap<Integer ,Plane>();

	static Map<Integer, Flight> flightList = new HashMap<Integer, Flight>();

	// Skapar en flygplansflotta...

	public Init()
	{planeList.put(747 ,new Plane(5, 5, "OskarPlan"));
	planeList.put(369, new Plane(10, 30, "NilsPlan"));
	planeList.put(900, new Plane(15, 25, "SvenPlan"));
	planeList.put(2475, new Plane(50, 100, "MariaPlan"));

	//Skapar lite olika flighter...	
	//Exempel p� DepartureTime...
	//LocalDateTime departureTime = LocalDateTime.of(2018, 8, 1, 12, 5);

	flightList.put(14, new Flight(14,"Stockholm", "Berlin", LocalDateTime.of(2018, 8, 1, 12, 5), LocalDateTime.of(2018, 8, 1, 12, 5), planeList.get(747)));		
	flightList.put(73, new Flight(73,"Stockholm", "Las Palmas", LocalDateTime.of(2018, 9, 1, 12, 5), LocalDateTime.of(2018, 9, 1, 16, 10), planeList.get(2475)));		
	flightList.put(97, new Flight(97,"Berlin", "Stockholm", LocalDateTime.of(2018, 10, 1, 12, 35), LocalDateTime.of(2018, 10, 1, 15, 5), planeList.get(900)));	
	flightList.put(33, new Flight(4,"Las Palmas", "Berlin", LocalDateTime.of(2018, 12, 1, 15, 25), LocalDateTime.of(2018, 12, 1, 20, 37), planeList.get(369)));	
	flightList.put(63, new Flight(5,"New York", "Stockholm", LocalDateTime.of(2018, 7, 28, 12, 30), LocalDateTime.of(2018, 7, 28, 23, 45), planeList.get(747)));		
	flightList.put(54, new Flight(6,"Stockholm", "New York", LocalDateTime.of(2018, 8, 3, 22, 25), LocalDateTime.of(2018, 8, 4, 8, 30), planeList.get(747)));

	
	
	Customer customer1 = new Customer("Gabriella", "Tyres�", "13547", "Sweden", "1234567");
	Customer customer2 = new Customer("Isak", "Tyres�", "13547", "Sweden", "1234567");
	Customer customer3 = new Customer("Elisabet", "Tyres�", "13547", "Sweden", "1234567");}

	
	
	

	
		
//
//		int price1 = FlightPrice.getPrice(PriceGroup.Economy);
//		int price2 = FlightPrice.getPrice(PriceGroup.FirstClass);
//		System.out.println("Priset i First Class " + price2);
//		System.out.println("Priset i Economy " + price1);

	

}

