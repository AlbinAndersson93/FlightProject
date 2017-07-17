package Food;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractFood {

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
	
	
	public abstract void createDrinks();
	public abstract void createAppetizer();
	public abstract void createMainCourse();
	public abstract void createKidsMeals();
	public abstract void createDesserts();		
	public abstract void createSandwich();
	public abstract void createSnacks();
	
}
