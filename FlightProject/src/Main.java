public class Main {

	public static void main(String[] args) {
		
		
		Customer c1=new Customer("Melvin", "Tummy Street 11", "13232", "Nacka", "123123123");
		Customer c2=new Customer("Saga", "This Street 11", "13232", "Nacka", "123123123");
		Customer c3=new Customer("Johan", "That Other Street 11", "13232", "Nacka", "123123123");
		Booking b1=new Booking(c1);
	
		b1.asignSeat();
		b1.asignMeal();
		b1.createTicket();
		System.out.println(b1.getTotalPrice());
		
		Booking b2=new Booking(c2);
		
		b2.asignSeat();
		b2.asignMeal();
		b2.createTicket();
		b2.setWantsFood(false);
		
		Booking b3=new Booking(c3);
		b3.asignSeat();
		b3.asignMeal();
		b3.createTicket();
		b3.setWantsFood(false);
		
		
		System.out.println(b3.getTotalPrice());
		
//		Booking b4=new Booking("Ylva");
		
		
	}

}
