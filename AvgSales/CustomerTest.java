
/**
       File: CustomerTest.java
	   Author: Abdul Wahid Pathan
Description: This testing class is used to create object for all the classes and display the results.
 */
public class CustomerTest
{

	public static void main(String[] args)
	{
		// Creating objects for the Corporate and retail worlds
		Corporate corpObj = new Corporate("Ford", 534267.24, 57);
		Retail retailObj = new Retail("Dev Sainani", 765.34, 8, "cash");
		
		// All the print statements for display
		System.out.println("Sales in Corporate: " + corpObj.getSales());
		System.out.println("Number of purchases in Corporate: " + corpObj.getNumPurchases());
		
		System.out.println("===================================");
		
		System.out.println("Number of sales in Retail: " + retailObj.getNumSales());
		System.out.println("Pay type in Retail: " + retailObj.getPayType());
		System.out.println("Puchase amount in Retail: " + retailObj.getPurchaseAmount());
		
		System.out.println("===================================");
		
		// Using the overridden toString method
		System.out.println(corpObj.toString());
		System.out.println(retailObj.toString());
		
		// Using setter method
		corpObj.setName("Air Canada");
		
		System.out.println("===================================");
		System.out.println("The corporate company has changed its name to: " + corpObj.getName());
		System.out.println("Average sales of the Corporate World: " + corpObj.reportAverageSales());
		System.out.println("Average sales of the Retail World: " + retailObj.reportAverageSales());
	}

}
