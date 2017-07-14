// Yared
package Food;

import java.util.ArrayList;
import java.util.Scanner;


public class FoodService {
	
	// All Food order Lists are stored here
	 ArrayList<FoodItem> orderList = new ArrayList<FoodItem>();

	private double totalFoodPrice;
	boolean foodOrdering = true;
	
	public ArrayList<FoodItem> getOrderList() {
		return orderList;
	}

	public boolean isFoodOrdering() {
		return foodOrdering;
	}

	public double getTotalFoodPrice() {
		return totalFoodPrice;
	}


	static Scanner sc = new Scanner(System.in);
	

	// The total price of the food order
	public  double TotalFoodPrice() {
		totalFoodPrice = orderList.stream().mapToDouble(foodPrice -> foodPrice.getPrice()).sum();
		return totalFoodPrice;
	}


	// Common for Economy & First Class Food Order
	// 8. Empty Order
	public  ArrayList<FoodItem> EmptyOrder() {
		orderList.removeAll(orderList);
		System.out.println("Now your Food Order is EMPTY.");
		orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
		return orderList;
	}
	
	// 9. Finish! Order 
	public  void OrderDone(){
	    foodOrdering = false;
	    orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
	    System.out.println("Your TOTAL food order price is: " + totalFoodPrice + "(SEK).");

	}// Common for Economy & First Class Ends
	
	// Economy Class Food Order
	public  ArrayList<FoodItem> OrderEcoAppetizer() {
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
			OrderEconomyClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	public  ArrayList<FoodItem> OrderEcoMainCource() {
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
			OrderEconomyClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderEcoKidsMeals() {
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
			OrderEconomyClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderEcoDesserts() {
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
			OrderEconomyClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderEcoDrinks() {
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
			OrderEconomyClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	
	public  ArrayList<FoodItem> OrderEcoSandwich() {
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
			OrderEconomyClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderEcoSnacks() {
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
			OrderEconomyClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  int OrderEconomyClassFood() {
		
		FoodMenu.flightMenu();//Prints Food Menu 
		int input =0;
	
		while (foodOrdering) {
			input = sc.nextInt();
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
				OrderDone();
				break;
			}

			
			default: {
				System.out.println("Wrong Choice!");
				break;
			}
			}
		}
		return input;
		
	}// Economy Class Food Order Ends here
	
	// First Class Food Order
	public  ArrayList<FoodItem> OrderFirstClassAppetizer() {
		FirstClassFoods foodItemList = new FirstClassFoods();
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
			OrderFirstClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	public  ArrayList<FoodItem> OrderFirstClassMainCource() {
		FirstClassFoods foodItemList = new FirstClassFoods();
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
			OrderFirstClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderFirstClassKidsMeals() {
		FirstClassFoods foodItemList = new FirstClassFoods();
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
			OrderFirstClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderFirstClassDesserts() {
		FirstClassFoods foodItemList = new FirstClassFoods();
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
			OrderFirstClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderFirstClassDrinks() {
		FirstClassFoods foodItemList = new FirstClassFoods();
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
			OrderFirstClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	
	public  ArrayList<FoodItem> OrderFirstClassSandwich() {
		FirstClassFoods foodItemList = new FirstClassFoods();
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
			OrderFirstClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	public  ArrayList<FoodItem> OrderFirstClassSnacks() {
		FirstClassFoods foodItemList = new FirstClassFoods();
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
			OrderFirstClassFood();
	    } catch (Exception e) {
	    }
		return orderList;
	}
	
	
	public  int OrderFirstClassFood() {
		
		FoodMenu.flightMenu();//Prints Food Menu 
		
		int input=0;
		while (foodOrdering) {
			
			input = sc.nextInt();
			switch (input){
			case 1: {

				OrderFirstClassAppetizer();
				break;
				
			}
			case 2: {
				OrderFirstClassMainCource();
				break;
			}
			case 3: {
				OrderFirstClassKidsMeals();
				break;
			}
			case 4: {
				OrderFirstClassDesserts();
				break;
			}
			case 5: {
				OrderFirstClassDrinks();
				break;
			}
			case 6: {
				OrderFirstClassSandwich();
				break;
			}
			case 7: {
				OrderFirstClassSnacks();
				break;
			}
			case 8: {
				EmptyOrder();
				break;
			}
			case 9: {
				OrderDone();
				break;
			}

			
			default: {
				System.out.println("Wrong Choice!");
				break;
			}
			}
		}
		return input;
		
	}// First Class Food Order ends here!
}
