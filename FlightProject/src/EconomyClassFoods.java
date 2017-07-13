// Yared
import java.util.ArrayList;
import java.util.List;


public class EconomyClassFoods {
	

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


	
	public EconomyClassFoods() {
		createAppetizer();
		createMainCourse();
		createKidsMeals();
		createDesserts();		
		createDrinks();
		createSandwich();
		createSnacks();
	}
	
	private void createSnacks() {
		snacks.add(new FoodItem("Seabrook Crisps (Cheese & Onion, Sea Salted or Salt & Vinegar)", 15.00));
		snacks.add(new FoodItem("KP Nuts (Salted or Dry Roasted)", 18.00));
		snacks.add(new FoodItem("Peperami", 21.00)); 
				
		
	}

	private void createSandwich() {
		sandwich.add(new FoodItem("Club Sandwich with Chicken", 45.80));
		sandwich.add(new FoodItem("Chicken Mayonnaise & Bacon", 45.80));
		sandwich.add(new FoodItem("Vegan", 55.00));
	}

	private void createKidsMeals() {
		kidsMeals.add(new FoodItem("Chees Burger", 65.00));
		kidsMeals.add(new FoodItem("Macaroni Cheese & Veg", 75));
		
	}

	private void createAppetizer() {
		appetizer.add(new FoodItem("Buffalo Chicken Dip", 15.50));
		appetizer.add(new FoodItem("Pepper Poppers", 25.00));
	}

	private void createDesserts() {
		desserts.add(new FoodItem("Cheesecake", 35.50));
		desserts.add(new FoodItem("Apple pie", 45.75));
		desserts.add(new FoodItem("Vanilla Ice Crea", 50));
	}

	private void createDrinks() {
		drinks.add(new FoodItem("Fanta", 35));
		drinks.add(new FoodItem("Tetley Tea", 25));
		drinks.add(new FoodItem("Starbucks VIA Coffee", 28.50));
		drinks.add(new FoodItem("Heineken (33m.)", 65.00));
		drinks.add(new FoodItem("Cook", 35));
		drinks.add(new FoodItem("Umbala (Red Win, 33ml)", 87.50));
		drinks.add(new FoodItem("Gin & Tonic", 125));
	}

	private void createMainCourse() {
		mainCourse.add(new FoodItem("Lasagna (Meat & Ricotta)", 300));
		mainCourse.add(new FoodItem("Giant Burger", 250));
		mainCourse.add(new FoodItem("Macaroni with chicken", 250));
	}

	
}
