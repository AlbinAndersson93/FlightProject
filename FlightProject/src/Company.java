//Albin
public class Company {
	private static int companyIncome;

	public static int getCompanyIncome() {
		return companyIncome;
	}

	public static void addToCompanyIncome(int totalMoney) {
		
		companyIncome += totalMoney*0.3;
	}


}