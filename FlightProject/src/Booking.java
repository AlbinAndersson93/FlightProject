import java.util.Scanner;

public class Booking {

	private String customer;

	private ClassType classType;
	private static int firstClassSeat=1;
	private static int economyClassSeat=6;


	private boolean wantsFood=false;
	private int totalPrice=0;

	private int assignedSeat;


	Scanner in=new Scanner(System.in);
	String input="";
	

	public Booking(String customer) {
		this.customer=customer;
		System.out.println(customer +" added");


	}

	public void asignSeat() {		//Assigning first/economy class and seat from user input
		System.out.println("Hello "+ customer+". Do you want to fly in first class or economy class? Enter 'First class' or 'Economy'");
		
		while(true){
			input=in.nextLine();
		if (input.equalsIgnoreCase("First class")){
			this.classType= ClassType.FIRST_CLASS;
			totalPrice+=20000;
			assignedSeat=firstClassSeat++;
			System.out.println("first class it is then. you have seat #"+assignedSeat);
			break;
			
	}
		
		else if(input.equalsIgnoreCase("economy")) {
			classType=ClassType.ECONOMY_CLASS;
			totalPrice+=5000;
			assignedSeat=economyClassSeat++;
			System.out.println("economy class it is then. you have seat #"+assignedSeat);
			break;
		}
		else System.out.println("Wrong input");
		
		}
	}



	public void asignMeal(){		//ask if they want meal, then run method for the class they belong to
		System.out.println(customer+", do you want to pre-order a meal for your flight? 'yes' or 'no'");
		while(true){
			input=in.nextLine();
			if(input.equalsIgnoreCase("yes") ) {
				if(classType.equals(ClassType.FIRST_CLASS)){
					System.out.println("printing first class menu");
					FoodService.FirstClassFoodService();
					break;
				}else{
					System.out.println("printing economy class menu");
					FoodService.EconomyClassFoodService();
					break;
				}
			}else if(input.equalsIgnoreCase("no")){
				System.out.println("No meal it is then.");
				break;
			}else{
				System.out.println("Wrong input, please enter 'yes' or 'no'.");
			}
		}
	}



public void setWantsFood(boolean b) {
	this.wantsFood=b;
	System.out.println(wantsFood);
}


public boolean isWantsFood() {
	return wantsFood;
}


public int getTotalPrice() {
	return totalPrice;
}

public void addToPrice(int price) {
	this.totalPrice += price;
}

public String getCustomer() {
	return customer;
}

public ClassType getClassType() {
	return classType;
}

public int getAssignedSeat() {
	return assignedSeat;
}



@Override
public String toString() {
	return "Booking [customer=" + customer + ", classType=" + classType + ", wantsFood=" + wantsFood + ", totalPrice="
			+ totalPrice + ", assignedSeat=" + assignedSeat + "]";
}









//take customer, check if economy/firstclass. asign seat at random, add price, check if wants meal,
}
