public class Main {

	public static void main(String[] args) {
		
		
		
		Booking b1=new Booking("Johan");
	
		b1.asignSeat();
		b1.asignMeal();
		b1.setWantsFood(true);
	
		System.out.println(b1.getTotalPrice());
		
		Booking b2=new Booking("Melvin");
		
		b2.asignSeat();
		
		b2.setWantsFood(false);
		
		Booking b3=new Booking("Saga");
		b3.asignSeat();
		
		b3.setWantsFood(false);
		
		
		System.out.println(b3.getTotalPrice());
		
//		Booking b4=new Booking("Ylva");
		
		
	}

}
