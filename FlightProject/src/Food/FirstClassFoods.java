//Yared

package Food;

import java.util.ArrayList;
import java.util.List;

public class FirstClassFoods extends AbstractFood {
	
	public FirstClassFoods() {
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
		snacks.add(new FoodItem("St Erik Crisps)", 115.00));
		snacks.add(new FoodItem("Donut Luxury Zebra Co", 118.00));
		snacks.add(new FoodItem("Glamburger from Honky Tonk", 121.00)); 
	}

	@Override
	public void createSandwich() {
		sandwich.add(new FoodItem("Hot Ham and Cheese", 145.80));
		sandwich.add(new FoodItem("Chicken Sandwich", 145.80));
		sandwich.add(new FoodItem("Sirloin Sandwich", 155.00));
	}

	@Override
	public void createKidsMeals() {
		kidsMeals.add(new FoodItem("Chees Burger", 165.00));
		kidsMeals.add(new FoodItem("Macaroni Cheese & Veg", 175.00));
		
	}

	@Override
	public void createAppetizer() {
		appetizer.add(new FoodItem("Spanish paella", 115.50));
		appetizer.add(new FoodItem("Smoked duck with lemon-dill and potato salad", 125.00));
	}

	@Override
	public void createDesserts() {
		desserts.add(new FoodItem("Cheesecake", 65.50));
		desserts.add(new FoodItem("Chocolate Cake with Berries", 85.75));
		desserts.add(new FoodItem("Strawberry Frozen Yogurt Bars", 150));
	}

	@Override
	public void createDrinks() {
		drinks.add(new FoodItem("Fanta", 75.00));
		drinks.add(new FoodItem("Tetley Tea", 55.00));
		drinks.add(new FoodItem("ETH Coffee", 88.50));
		drinks.add(new FoodItem("Heineken (33m.)", 65.00));
		drinks.add(new FoodItem("Cook", 75.00));
		drinks.add(new FoodItem("Château le Puy, Bordeaux (Red Win, 33ml)", 187.50));
		drinks.add(new FoodItem("Gin & Tonic", 175.00));
		drinks.add(new FoodItem("Irish Coffee", 225.00));
	}

	@Override
	public void createMainCourse() {
		mainCourse.add(new FoodItem("Roast Chicken with braised cannellini beans and chanterelles", 550.00));
		mainCourse.add(new FoodItem("Beef Kare Kare", 560.00));
		mainCourse.add(new FoodItem("Yellowtail with teriyaki and truffle sauce + sweet potatoes,", 595.00));
	}

	

}