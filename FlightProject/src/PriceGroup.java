//Gabriella
public enum PriceGroup {
	Economy, FirstClass;
	
	private int priceFirstClass=20000;
	private int priceEconomyClass=5000;

	public int getPrice() {
		if (this==PriceGroup.FirstClass)return priceFirstClass;
		else return priceEconomyClass;
	}




	}

	
	


	


