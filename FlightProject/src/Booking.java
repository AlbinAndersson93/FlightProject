import java.util.ArrayList;
import java.util.List;

public class Booking {

	private String customer;

	private ClassType classType;
	private static int firstClassSeat=1;
	private static int economyClassSeat=6;


	private boolean wantsFood=false;
	private int totalPrice=0;

	private int assignedSeat;



	public Booking(String customer) {
		this.customer=customer;
		System.out.println(customer +" added");


	}

	public void setClassType(ClassType classType) {
		this.classType=classType;
		if (this.classType==ClassType.FIRST_CLASS) {
			totalPrice+=20000;
			System.out.println("first class");
		}
		else if(this.classType==ClassType.ECONOMY_CLASS) {
			totalPrice+=5000;
			System.out.println("economy class");
		}
		else System.out.println("Wrong class input");

	}

	public void assignSeat() {

		if (this.classType.equals(ClassType.FIRST_CLASS)) {
			this.assignedSeat=firstClassSeat;
			firstClassSeat++;





			System.out.println("assigend seat "+assignedSeat);

		}

		else if (this.classType.equals(ClassType.ECONOMY_CLASS)){
			this.assignedSeat=economyClassSeat;
			economyClassSeat++;
			System.out.println("assigend seat "+assignedSeat);

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
	return "Booking [customer=" + customer + ", classType=" + classType + ", wantsFood=" + wantsFood
			+ ", totalPrice=" + totalPrice + ", assignedSeat=" + assignedSeat + "]";
}









//take customer, check if economy/firstclass. asign seat at random, add price, check if wants meal,
}
