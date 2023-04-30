
/**
       File: Customer.java
	   Author: Abdul Wahid Pathan
Description: This abstract parent class is used to declare all the common properties and methods for its sub classes
 */
public abstract class Customer
{
	// Declaring variables
	private String type;
	private String name;
	
	// One-arg constructor
	public Customer(String type)
	{
		this.name = "Microsoft";
		this.type = type;
	}
	
	// Two-arg constructor
	public Customer(String type, String name)
	{
		this.type = type;
		this.name = name;
	}
	
	// Getter methods
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	// Setter methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	/* Method Name: reportAverageSales
	 * Purpose: To report the average sales of subclass World
	 * Accepts: N/A
	 * Returns: double
	 */
	public abstract double reportAverageSales();
	
	/* Method Name: toString
	 * Purpose: To print report for subclass world
	 * Accepts: N/A
	 * Returns: String
	 */
	public String toString()
	{
		return "This customer is from the " + this.type + " world, the name of which is " + this.name; 
	}
}
