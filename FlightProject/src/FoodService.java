// Yared

import java.util.ArrayList;
import java.util.Scanner;


public class FoodService {
	
	ArrayList<FoodItem> orderList = new ArrayList<FoodItem>();

	public double totalFoodPrice;
//	public static double runningTotal;
//	private static double foodItemPrice;
//	static boolean foodOrdering = true;
	
	
	static Scanner sc = new Scanner(System.in);
	
	public void foodService() {
		// TODO Auto-generated method stub
		
	}

	public static void FirstClassFoodService() {
		System.out.println("You have chosen FIRST Class.\nStart by Choosing Appetizer.");

		
	}

	public static void EconomyClassFoodService() {
	}
	
	
	public ArrayList<FoodItem> OrderAppetizer() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.appetizer.stream().forEach(x -> System.out.println(foodItemList.appetizer.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.appetizer.size()-1){
			orderList.add(foodItemList.getAppetizer().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + ":- Is in the list" ));

		}
		else if (choice >= foodItemList.appetizer.size()-1) {
			System.out.println("Wrong Choice!");
		}
		
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	public ArrayList<FoodItem> OrderMainCource() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.mainCourse.stream().forEach(x -> System.out.println(foodItemList.mainCourse.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.mainCourse.size()-1){
			orderList.add(foodItemList.getMainCourse().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + ":- Is in the list" ));
		}
		else if (choice >= foodItemList.mainCourse.size()-1) {
			System.out.println("Wrong Choice!");
		}
		
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public ArrayList<FoodItem> KidsMeals() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.kidsMeals.stream().forEach(x -> System.out.println(foodItemList.kidsMeals.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.kidsMeals.size()-1){
			orderList.add(foodItemList.getKidsMeals().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + ":- Is in the list" ));
		}
		else if (choice >= foodItemList.kidsMeals.size()-1) {
			System.out.println("Wrong Choice!");
		}
		
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	public ArrayList<FoodItem> orderFood() {
		
		System.out.println("Choose the number for the Menu:\n1. Appetizer\n2. Main Course"
				+ "\n3. Kids Meals\n4. Desserts\n5. Drinks\n6. Sandwich"
				+ "\n7. Finish with Food Order\n0. Cancel Food Order");
		int input = sc.nextInt();
	
		while (true) {
			switch (input){
			case 1: {

				OrderAppetizer();
				break;
				
			}
			case 2: {
				OrderMainCource();
				break;
			}
			case 3: {
				KidsMeals();
				break;
			}
			
			case 0: {
				
				break;
			}
			
			default: {
				System.out.println("Wrong Choice!");
				break;
			}
			}
		}
		
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
				
				EconomyClassFoodService();
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


//System.out.println("Do you want Appetizer, enter '1' for yes or '2' for no.");
//EconomyClassFoods foodItemList = new EconomyClassFoods();
//
//while (true) {
//	
//	int input = sc.nextInt();
//
//	if(input == 1) {
//		System.out.println("Choose the number from the list");
//		foodItemList.appetizer.stream().forEach(x -> System.out.println(foodItemList.appetizer.indexOf(x) + ": " + x));
//		int choice = sc.nextInt();
//		orderList.add(foodItemList.getAppetizer().get(choice));
//		
//		orderList.forEach(food -> System.out.println(food.getName() + " Is in the list" ));
//		
//		return orderList;
//		
//}}
