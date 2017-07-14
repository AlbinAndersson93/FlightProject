//Yared

package Food;

import java.util.ArrayList;
import java.util.List;



public class FirstClassFoods {
	

	List<FoodItem> appetizer = new ArrayList<FoodItem>();
	List<FoodItem> mainCourse = new ArrayList<FoodItem>();
	List<FoodItem> kidsMeals = new ArrayList<FoodItem>();
	List<FoodItem> drinks = new ArrayList<FoodItem>();
	List<FoodItem> desserts = new ArrayList<FoodItem>();
	List<FoodItem> sandwich = new ArrayList<FoodItem>();
	List<FoodItem> snacks = new ArrayList<FoodItem>();
	
	
	public List<FoodItem> getSnacks() {
		return snacks;
	}

	public void setSnacks(List<FoodItem> snacks) {
		this.snacks = snacks;
	}

	public List<FoodItem> getAppetizer() {
		return appetizer;
	}

	public void setAppetizer(List<FoodItem> appetizer) {
		this.appetizer = appetizer;
	}

	public List<FoodItem> getKidsMeals() {
		return kidsMeals;
	}

	public void setKidsMeals(List<FoodItem> kidsMeals) {
		this.kidsMeals = kidsMeals;
	}

	public List<FoodItem> getSandwich() {
		return sandwich;
	}

	public void setSandwich(List<FoodItem> sandwich) {
		this.sandwich = sandwich;
	}

	public List<FoodItem> getDesserts() {
		return desserts;
	}

	public void setDesserts(List<FoodItem> desserts) {
		this.desserts = desserts;
	}

	public List<FoodItem> getMainCourse() {
		return mainCourse;
	}

	public void setMainCourse(List<FoodItem> mainCourse) {
		this.mainCourse = mainCourse;
	}

	public List<FoodItem> getDrinks() {
		return drinks;
	}

	public void setDrinks(List<FoodItem> drinks) {
		this.drinks = drinks;
	}


	
	public FirstClassFoods() {
		createAppetizer();
		createMainCourse();
		createKidsMeals();
		createDesserts();		
		createDrinks();
		createSandwich();
		createSnacks();
	}
	
	private void createSnacks() {
		snacks.add(new FoodItem("St Erik Crisps)", 115.00));
		snacks.add(new FoodItem("Donut Luxury Zebra Co", 118.00));
		snacks.add(new FoodItem("Glamburger from Honky Tonk", 121.00)); 
				
		
	}

	private void createSandwich() {
		sandwich.add(new FoodItem("Hot Ham and Cheese", 145.80));
		sandwich.add(new FoodItem("Chicken Sandwich", 145.80));
		sandwich.add(new FoodItem("Sirloin Sandwich", 155.00));
	}

	private void createKidsMeals() {
		kidsMeals.add(new FoodItem("Chees Burger", 165.00));
		kidsMeals.add(new FoodItem("Macaroni Cheese & Veg", 175.00));
		
	}

	private void createAppetizer() {
		appetizer.add(new FoodItem("Spanish paella", 115.50));
		appetizer.add(new FoodItem("Smoked duck with lemon-dill and potato salad", 125.00));
	}

	private void createDesserts() {
		desserts.add(new FoodItem("Cheesecake", 65.50));
		desserts.add(new FoodItem("Chocolate Cake with Berries", 85.75));
		desserts.add(new FoodItem("Strawberry Frozen Yogurt Bars", 150));
	}

	private void createDrinks() {
		drinks.add(new FoodItem("Fanta", 75.00));
		drinks.add(new FoodItem("Tetley Tea", 55.00));
		drinks.add(new FoodItem("ETH Coffee", 88.50));
		drinks.add(new FoodItem("Heineken (33m.)", 65.00));
		drinks.add(new FoodItem("Cook", 75.00));
		drinks.add(new FoodItem("Château le Puy, Bordeaux (Red Win, 33ml)", 187.50));
		drinks.add(new FoodItem("Gin & Tonic", 175.00));
		drinks.add(new FoodItem("Irish Coffee", 225.00));
	}

	private void createMainCourse() {
		mainCourse.add(new FoodItem("Roast Chicken with braised cannellini beans and chanterelles", 550.00));
		mainCourse.add(new FoodItem("Beef Kare Kare", 560.00));
		mainCourse.add(new FoodItem("Yellowtail with teriyaki and truffle sauce + sweet potatoes,", 595.00));
	}

	

}