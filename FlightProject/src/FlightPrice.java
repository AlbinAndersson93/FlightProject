//Gabriella


//Kommer nog inte användas, har lagt över värderna till enum klassen
public class FlightPrice {
	PriceGroup priceGroup;
	public static int price;

	public FlightPrice(PriceGroup priceGroup) {
		this.priceGroup = priceGroup;
	}

	public static int getPrice(PriceGroup priceGroup){

		switch(priceGroup){
		case Economy:
			price = 5000;
			break;

		case FirstClass:
			price = 20000;
			break;
			
		default:
			price = 0;
			break;
		}
		return price;
	}
}
