
/**
       File: Retail.java
	   Author: Abdul Wahid Pathan
Description: This subclass of Customer is overriding methods it got from parent class and describing
						 sales, purchases, and paytype of the retail world.
 */
public class Retail extends Customer
{
	// Declaring variables
	private double purchaseAmount;
	private int numSales;
	private String payType;
	
	// No-arg constructor
	public Retail()
	{
		super("Retail");
		this.purchaseAmount = 1527.35;
		this.numSales = 4;
		this.payType = "credit card";
	}
	
	// four-args constructor
	public Retail(String name, double purchaseAmount, int numSales, String payType)
	{
		super("Retail", name);
		this.purchaseAmount = purchaseAmount;
		this.numSales = numSales;
		this.payType = payType;
	}
	
	// Getter methods
	public double getPurchaseAmount()
	{
		return this.purchaseAmount;
	}
	
	public int getNumSales()
	{
		return this.numSales;
	}
	
	public String getPayType()
	{
		return this.payType;
	}
	
	// Setter methods
	public void setPurchaseAmount(double purchaseAmount)
	{
		this.purchaseAmount = purchaseAmount;
	}
	
	public void setNumSales(int numSales)
	{
		this.numSales = numSales;
	}
	
	public void setPayType(String payType)
	{
		this.payType = payType;
	}
	
	/* Method Name: reportAverageSales
	 * Purpose: To report the average sales of retail World
	 * Accepts: N/A
	 * Returns: double
	 */
	@Override
	public double reportAverageSales()
	{
		return this.purchaseAmount/this.numSales;
	}
	
	/* Method Name: toString
	 * Purpose: To print report for retail world
	 * Accepts: N/A
	 * Returns: String
	 */
	public String toString()
	{
		return super.toString() + "This "+ this.getName() +" customer has made " + this.numSales + " puchases for a total of $" + this.purchaseAmount + ". The purchases were paid for by " + " " + this.payType;
	}
}
