// Yared

import java.util.ArrayList;
import java.util.Scanner;


public class FoodService {
	
	static ArrayList<FoodItem> orderList = new ArrayList<FoodItem>();

	public static double totalFoodPrice=0;
	static boolean foodOrdering = true;
//	public static double runningTotal;
//	private static double foodItemPrice;
	
	
	static Scanner sc = new Scanner(System.in);
	
	public void foodService() {
		// TODO Auto-generated method stub
		
	}
	
	
	// The total price of the food order
	public static double TotalFoodPrice() {
		totalFoodPrice = orderList.stream().mapToDouble(foodPrice -> foodPrice.getPrice()).sum();
		return totalFoodPrice;
	}

	public static void FirstClassFoodService() {
		System.out.println("You have chosen FIRST Class.\nStart by Choosing Appetizer.");
	}

	public static void EconomyClassFoodService() {
		FoodService fs = new FoodService();
		fs.orderFood();
		
	}
	
	public static ArrayList<FoodItem> OrderEcoAppetizer() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.appetizer.stream().forEach(x -> System.out.println(foodItemList.appetizer.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.appetizer.size()-1){
			orderList.add(foodItemList.getAppetizer().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
			TotalFoodPrice();			
			
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
	public static ArrayList<FoodItem> OrderEcoMainCource() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.mainCourse.stream().forEach(x -> System.out.println(foodItemList.mainCourse.indexOf(x) + ": " + x));
		
		int choice = sc.nextInt();
		if(choice <= foodItemList.mainCourse.size()-1){
			orderList.add(foodItemList.getMainCourse().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
			TotalFoodPrice();
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
	
	public static ArrayList<FoodItem> OrderEcoKidsMeals() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.kidsMeals.stream().forEach(x -> System.out.println(foodItemList.kidsMeals.indexOf(x) + ": " + x));
		
		int choice = sc.nextInt();
		if(choice <= foodItemList.kidsMeals.size()-1){
			orderList.add(foodItemList.getKidsMeals().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
			TotalFoodPrice();
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
	
	public static ArrayList<FoodItem> OrderEcoDesserts() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.desserts.stream().forEach(x -> System.out.println(foodItemList.desserts.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.desserts.size()-1){
			orderList.add(foodItemList.getDesserts().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
			TotalFoodPrice();
		}
		else if (choice >= foodItemList.desserts.size()-1) {
			System.out.println("Wrong Choice!");
		}
		
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public static ArrayList<FoodItem> OrderEcoDrinks() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.drinks.stream().forEach(x -> System.out.println(foodItemList.drinks.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.drinks.size()-1){
			orderList.add(foodItemList.getDrinks().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
			TotalFoodPrice();
		}
		else if (choice >= foodItemList.drinks.size()-1) {
			System.out.println("Wrong Choice!");
		}
		
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	
	public static ArrayList<FoodItem> OrderEcoSandwich() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.sandwich.stream().forEach(x -> System.out.println(foodItemList.sandwich.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.sandwich.size()-1){
			orderList.add(foodItemList.getSandwich().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
			TotalFoodPrice();
		}
		else if (choice >= foodItemList.sandwich.size()-1) {
			System.out.println("Wrong Choice!");
		}
		
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public static ArrayList<FoodItem> OrderEcoSnacks() {
		EconomyClassFoods foodItemList = new EconomyClassFoods();
		System.out.println("Choose the number from the list");
		foodItemList.snacks.stream().forEach(x -> System.out.println(foodItemList.snacks.indexOf(x) + ": " + x));

		int choice = sc.nextInt();
		if(choice <= foodItemList.snacks.size()-1){
			orderList.add(foodItemList.getSnacks().get(choice));
			orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
			TotalFoodPrice();
		}
		else if (choice >= foodItemList.snacks.size()-1) {
			System.out.println("Wrong Choice!");
		}
		
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public static ArrayList<FoodItem> EmptyOrder() {
		orderList.removeAll(orderList);
		System.out.println("Now your Food Order is EMPTY.");
		orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
		try {
			orderFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	// 9. Finish! Order 
	public static void OrderEcoDone(){
	    foodOrdering = false;
	    orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
	    System.out.println("***********************************************"
	    		+ "\nYour TOTAL food order price is: " + totalFoodPrice + "(SEK).");
	    System.out.println("***********************************************"
	    		+ "\nWe hope you will enjoy your meal on the flight!\nThank you for flying with us!"
	    		+ "\n***********************************************");
	}
	
	public static int orderFood() {
		
		FoodMenu.flightMenu();//Prints Food Menu 
		int input = sc.nextInt();
	
		while (foodOrdering) {
			switch (input){
			case 1: {

				OrderEcoAppetizer();
				break;
				
			}
			case 2: {
				OrderEcoMainCource();
				break;
			}
			case 3: {
				OrderEcoKidsMeals();
				break;
			}
			case 4: {
				OrderEcoDesserts();
				break;
			}
			case 5: {
				OrderEcoDrinks();
				break;
			}
			case 6: {
				OrderEcoSandwich();
				break;
			}
			case 7: {
				OrderEcoSnacks();
				break;
			}
			case 8: {
				EmptyOrder();
				break;
			}
			case 9: {
				OrderEcoDone();
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
		return input;
		
	}
}
