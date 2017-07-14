//Albin
package PersonAndCompanies;
public class Company {
	private static int companyIncome;

	public static int getCompanyIncome() {
		return companyIncome;
	}

	public static void addToCompanyIncome(int totalMoney) {
		
		companyIncome += totalMoney*0.3;
	}

	public static void printCompanyIncome(){
		System.out.println("Total income today for the Company is: "+companyIncome);
	}

}
