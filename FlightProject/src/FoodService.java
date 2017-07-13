//Yared
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FoodService {

//	public double totalFoodPrice;
//	public static double runningTotal;
//	private static double foodItemPrice;
//	static boolean foodOrdering = true;
	
	
	int choice;
	

	
	static Scanner sc = new Scanner(System.in);
	
	public static void foodService() {
		// TODO Auto-generated method stub
		
	}

	public static void FirstClassFoodService() {
		System.out.println("You have chosen FIRST Class.\nStart by Choosing Appetizer.");
		
		
	}

	public static void EconomyClassFoodService() {
		System.out.println("You have chosen ECONOMY Class.");
		
	}
	

	public void start() {
		System.out.println("Choose your Reservation class by respective number. \n1. First Class. \n2. Economy Class.");
		
		while(true){
			
			//Take Input
			int input = sc.nextInt();
			
			//Check Input
			switch (input) {
			
			case 1: {
				
				FirstClassFoodService();
				break;
			}
			
			case 2: {
				
				
				break;
			}
			
			case 3: {
				
				
				break;
			}
			
			default: {
				
				break;
			}
			}
		}
	}
	
}
