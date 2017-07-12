import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Booking b1=new Booking("Johan");

		
	
	
		b1.setClassType(ClassType.FIRST_CLASS);
		b1.assignSeat();
		b1.setWantsFood(true);
	
		System.out.println(b1.getTotalPrice());
		
		Booking b2=new Booking("Melvin");
		
		b2.setClassType(ClassType.ECONOMY_CLASS);
		b2.assignSeat();
		b2.setWantsFood(false);
		
		Booking b3=new Booking("Saga");
		b3.setClassType(ClassType.ECONOMY_CLASS);
		b3.assignSeat();
		b3.setWantsFood(false);
		
		System.out.println(b3.getTotalPrice());
		
//		Booking b4=new Booking("Ylva");
		
		
	}

}
