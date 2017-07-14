// Yared

package Food;

import java.util.ArrayList;
import java.util.List;


public class EconomyClassFoods extends AbstractFood {

	public EconomyClassFoods() {
		createAppetizer();
		createMainCourse();
		createKidsMeals();
		createDesserts();		
		createDrinks();
		createSandwich();
		createSnacks();
	}
	
	@Override
	public void createSnacks() {
		snacks.add(new FoodItem("Seabrook Crisps (Cheese & Onion, Sea Salted or Salt & Vinegar)", 15.00));
		snacks.add(new FoodItem("KP Nuts (Salted or Dry Roasted)", 18.00));
		snacks.add(new FoodItem("Peperami", 21.00)); 
		
	}

	@Override
	public void createSandwich() {
		sandwich.add(new FoodItem("Club Sandwich with Chicken", 45.80));
		sandwich.add(new FoodItem("Chicken Mayonnaise & Bacon", 45.80));
		sandwich.add(new FoodItem("Vegan", 55.00));
	}

	@Override
	public void createKidsMeals() {
		kidsMeals.add(new FoodItem("Chees Burger", 65.00));
		kidsMeals.add(new FoodItem("Macaroni Cheese & Veg", 75.00));
		
	}

	@Override
	public void createAppetizer() {
		appetizer.add(new FoodItem("Buffalo Chicken Dip", 15.50));
		appetizer.add(new FoodItem("Pepper Poppers", 25.00));
	}

	@Override
	public void createDesserts() {
		desserts.add(new FoodItem("Cheesecake", 35.50));
		desserts.add(new FoodItem("Apple pie", 45.75));
		desserts.add(new FoodItem("Vanilla Ice Crea", 50));
	}

	@Override
	public void createDrinks() {
		drinks.add(new FoodItem("Fanta", 35.00));
		drinks.add(new FoodItem("Tetley Tea", 25.00));
		drinks.add(new FoodItem("Starbucks VIA Coffee", 28.50));
		drinks.add(new FoodItem("Heineken (33m.)", 65.00));
		drinks.add(new FoodItem("Cook", 35.00));
		drinks.add(new FoodItem("Umbala (Red Win, 33ml)", 87.50));
		drinks.add(new FoodItem("Gin & Tonic", 125.00));
	}

	@Override
	public void createMainCourse() {
		mainCourse.add(new FoodItem("Lasagna (Meat & Ricotta)", 300.00));
		mainCourse.add(new FoodItem("Giant Burger", 250.00));
		mainCourse.add(new FoodItem("Macaroni with chicken", 250.00));
	}

	
}
