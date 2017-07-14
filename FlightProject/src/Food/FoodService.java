// Yared
package Food;

import java.util.ArrayList;
import java.util.Scanner;


import Util.PriceGroup;


public class FoodService {

	// All Food order Lists are stored here
	private ArrayList<FoodItem> orderList = new ArrayList<FoodItem>();

	public double totalFoodPrice;
	 boolean foodOrdering = true;
	public ArrayList<FoodItem> getOrderList() {
		return orderList;
	}
	private PriceGroup priceGroup;

	 Scanner sc = new Scanner(System.in);


	// The total price of the food order
	public double TotalFoodPrice() {
		totalFoodPrice = orderList.stream().mapToDouble(foodPrice -> foodPrice.getPrice()).sum();
		System.out.println("Total Food Price: " + totalFoodPrice + "(SEK).");
		return totalFoodPrice;
	}

	public void FirstClassFoodService() {
		priceGroup = PriceGroup.FirstClass;
		OrderFood();
	}

	public void EconomyClassFoodService() {
		priceGroup = PriceGroup.Economy;
		OrderFood();

	}

	// 
	public ArrayList<FoodItem> OrderAppetizer() {

		AbstractFood foodItemList;
		if (priceGroup.equals(PriceGroup.FirstClass)) {
			foodItemList = new FirstClassFoods();			
		}
		else {
			foodItemList = new EconomyClassFoods();
		}

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
			OrderFood();
		} catch (Exception e) {
		}

		return orderList;
	}

	public ArrayList<FoodItem> OrderMainCource() {
		AbstractFood foodItemList;
		if (priceGroup.equals(PriceGroup.FirstClass)) {
			foodItemList = new FirstClassFoods();			
		}
		else {
			foodItemList = new EconomyClassFoods();
		}

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
			OrderFood();
		} catch (Exception e) {
		}
		return orderList;
	}

	public ArrayList<FoodItem> OrderKidsMeals() {
		AbstractFood foodItemList;
		if (priceGroup.equals(PriceGroup.FirstClass)) {
			foodItemList = new FirstClassFoods();			
		}
		else {
			foodItemList = new EconomyClassFoods();
		}

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
			OrderFood();
		} catch (Exception e) {
		}
		return orderList;
	}

	public ArrayList<FoodItem> OrderDesserts() {
		AbstractFood foodItemList;
		if (priceGroup.equals(PriceGroup.FirstClass)) {
			foodItemList = new FirstClassFoods();			
		}
		else {
			foodItemList = new EconomyClassFoods();
		}

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
			OrderFood();
		} catch (Exception e) {
		}
		return orderList;
	}

	public ArrayList<FoodItem> OrderDrinks() {
		AbstractFood foodItemList;
		if (priceGroup.equals(PriceGroup.FirstClass)) {
			foodItemList = new FirstClassFoods();			
		}
		else {
			foodItemList = new EconomyClassFoods();
		}

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
			OrderFood();
		} catch (Exception e) {
		}
		return orderList;
	}


	public ArrayList<FoodItem> OrderSandwich() {
		AbstractFood foodItemList;
		if (priceGroup.equals(PriceGroup.FirstClass)) {
			foodItemList = new FirstClassFoods();			
		}
		else {
			foodItemList = new EconomyClassFoods();
		}

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
			OrderFood();
		} catch (Exception e) {
		}
		return orderList;
	}

	public ArrayList<FoodItem> OrderSnacks() {
		AbstractFood foodItemList;
		if (priceGroup.equals(PriceGroup.FirstClass)) {
			foodItemList = new FirstClassFoods();			
		}
		else {
			foodItemList = new EconomyClassFoods();
		}

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
			OrderFood();
		} catch (Exception e) {
		}
		return orderList;
	}

	// 8. Empty Order
	public ArrayList<FoodItem> EmptyOrder() {
		orderList.removeAll(orderList);
		System.out.println("Now your Food Order is EMPTY.");
		orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
		return orderList;
	}

	// 9. Finish! Order 
	public void OrderDone(){
		foodOrdering = false;
		orderList.forEach(food -> System.out.println(food.getName() + " " + food.getPrice() + "(SEK)." ));
	}
	
	public int OrderFood() {
		
		FoodMenu.flightMenu();//Prints Food Menu 
		int input = sc.nextInt();

		while (foodOrdering) {
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
				OrderKidsMeals();
				break;
			}
			case 4: {
				OrderDesserts();
				break;
			}
			case 5: {
				OrderDrinks();
				break;
			}
			case 6: {
				OrderSandwich();
				break;
			}
			case 7: {
				OrderSnacks();
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
