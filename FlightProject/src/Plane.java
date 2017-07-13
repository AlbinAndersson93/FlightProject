//Gabriella
import java.util.ArrayList;
import java.util.List;

public class Plane {
	static int seatsEconomy;
	static int seatsFirstClass;
	String name;
	
	
	public Plane(int seatsEconomy, int seatsFirstClass, String name) {

		this.seatsEconomy = seatsEconomy;
		this.seatsFirstClass = seatsFirstClass;
		this.name = name;
	}
		
	static int totalNumberOfSeats = seatsEconomy + seatsFirstClass;
		
	public int getTotalNumberOfSeats() {
		return totalNumberOfSeats;
	}
	
	public int getSeatsEconomy() {
		return seatsEconomy;
	}
	public void setSeatsEconomy(int seatsEconomy) {
		this.seatsEconomy = seatsEconomy;
	}
	public int getSeatsFirstClass() {
		return seatsFirstClass;
	}
	public void setSeatsFirstClass(int seatsFirstClass) {
		this.seatsFirstClass = seatsFirstClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}