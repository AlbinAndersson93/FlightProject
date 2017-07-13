
public class FoodServiceMain {
 
	public static void main(String[] args) {
		
		EconomyClassFoods ecoFood = new EconomyClassFoods();
		
 		
		for(FoodItem i : ecoFood.getMainCourse()){
			System.out.println(i.getName() + " " + i.getPrice());
		}

	}

}
